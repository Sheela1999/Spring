package com.xworkz.doctor.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.doctor.dto.DoctorDto;

@Component
public class DoctorRepoImpl implements DoctorRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(DoctorDto dto) {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<DoctorDto> findByName(String name) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<DoctorDto> query = em.createNamedQuery("findByName", DoctorDto.class);
		query.setParameter("nm", name);
		List<DoctorDto> dto = query.getResultList();
		if (!dto.isEmpty()) {
			return dto;
		}
		System.out.println("dto is null");
		return null;
	}

}
