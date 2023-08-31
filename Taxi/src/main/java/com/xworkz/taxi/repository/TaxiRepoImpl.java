package com.xworkz.taxi.repository;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.MyComparator;
import com.xworkz.taxi.dto.TaxiDto;

@Component
public class TaxiRepoImpl implements TaxiRepo{
	
	public EntityManagerFactory emf = Persistence.createEntityManagerFactory("taxi-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean saveTaxi(TaxiDto dto) {
		if(em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			System.out.println("data saved successfully");
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll", TaxiDto.class);
		List list = query.getResultList();
		return list;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> query = em.createNamedQuery("findTaxiByLocation", TaxiDto.class);
		query.setParameter("ln", location);
		return query.getSingleResult();
	}

	@Override
	public boolean updateTaxiEarningsById(int id, int earnings) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateTaxiEarningsById");
		query.setParameter("id", id);
		query.setParameter("er", earnings);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateTaxiAvailableById(int id, boolean isAvailable) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("updateTaxiAvailableById");
		query.setParameter("td", id);
		query.setParameter("ia", isAvailable);
		query.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public List<TaxiDto> findAllAvailableTaxi(boolean isAvailable) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("findAll", TaxiDto.class);
		query.setParameter("ab", isAvailable);
		List list = query.getResultList();
		return list;
	}

	@Override
	public TaxiDto bookTaxi() {
		EntityManager em = emf.createEntityManager();
		if(em != null) {
			
		    List<TaxiDto> dto = findAllAvailableTaxi(true);
		    
		    MyComparator comp = new MyComparator();
		    
		    Collections.sort(dto, comp);
		    
		    for (TaxiDto taxiDto : dto) {
				System.out.println(taxiDto);
			}
		    
		    for (TaxiDto list : dto) {
		    	int eachTripEarning = 200;
		    	int updateEarning = list.getEarnings() + eachTripEarning;
		    	
		    	updateTaxiEarningsById(updateEarning, list.getId());
		    	updateTaxiAvailableById(list.getId(), false);
		    	return list;
			}
		    return null;
		}
		return null;
		
	}

}
