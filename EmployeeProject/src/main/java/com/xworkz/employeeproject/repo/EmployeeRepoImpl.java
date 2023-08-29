package com.xworkz.employeeproject.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.employeeproject.dto.EmployeeDto;

@Component
public class EmployeeRepoImpl implements EmployeeRepo{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(EmployeeDto dto) {
		if(em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			System.out.println("Data saved");
			return true;
		}
		return false;
	}
	
	@Override
	public List<EmployeeDto> readAll() {
		TypedQuery<EmployeeDto> query = em.createQuery("From EmployeeDto", EmployeeDto.class);
		List<EmployeeDto> read = query.getResultList();
		return read;
	}

	@Override
	public EmployeeDto findByEmployeeName(String name) {
		TypedQuery<EmployeeDto> query = em.createQuery("From EmployeeDto where employeeName=" + name, EmployeeDto.class);
		EmployeeDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public EmployeeDto findSalaryByEmployeeName(int salary, String name) {
		EmployeeDto dto = findByEmployeeName(name);
		TypedQuery<EmployeeDto> query = em.createQuery("From EmployeeDto where salary=" + salary, EmployeeDto.class);
		EmployeeDto dto1 = query.getSingleResult();
		if(dto.equals(dto1)) {
			return dto1;
		}
		return null;
	}

	@Override
	public boolean updateDesignationByEmployeeName(String name, String designation) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		EmployeeDto found = findByEmployeeName(name);
		found.setDesignation(designation);
		em.merge(found);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateCompanyNameandEducationByEmployeeName(String companyName, String education, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		EmployeeDto found = findByEmployeeName(name);
		found.setCompanyName(companyName);
		found.setEducation(education);
		em.merge(found);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		EmployeeDto deleted = em.find(EmployeeDto.class, id);
		deleted.getId();
		em.remove(deleted);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteByAddressAndEmail(String address, String email) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		TypedQuery<EmployeeDto> query = em.createQuery("from EmployeeDto where address=" + address, EmployeeDto.class);
		EmployeeDto dto1 = query.getSingleResult();
		System.out.println(dto1);
		TypedQuery<EmployeeDto> query1 = em.createQuery("from EmployeeDto where email=" + email, EmployeeDto.class);
		EmployeeDto dto2 = query1.getSingleResult();
		System.out.println(dto2);
		if(dto1.equals(dto2)) {
			em.remove(dto2);
			System.out.println("Values are matching and Dto is deleted");
		transaction.commit();
		return true;
		}
		System.out.println("values are not matching");
		return false;
	}

	@Override
	public boolean deleteByAddressAndEmployeeId(String address, int employeeId) {
		if(em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			TypedQuery<EmployeeDto> query = em.createQuery("from EmployeeDto where address=" + address, EmployeeDto.class);
			EmployeeDto dto1 = query.getSingleResult();
			TypedQuery<EmployeeDto> query1 = em.createQuery("from EmployeeDto where employeeId=" + employeeId, EmployeeDto.class);
			EmployeeDto dto2 = query1.getSingleResult();
			if(dto1.equals(dto2)) {
				em.remove(dto2);
				System.out.println("Values are matching and Dto is deleted");
			transaction.commit();
			return true;
			}
			System.out.println("values are not matching");
			return false;
		}
		return false;
	}

}
