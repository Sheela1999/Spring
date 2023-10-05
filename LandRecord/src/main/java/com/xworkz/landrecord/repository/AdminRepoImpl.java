package com.xworkz.landrecord.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.landrecord.dto.AdminDto;

@Repository
public class AdminRepoImpl implements AdminRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public AdminDto findByNameAndEmail(String adminName, String email) throws Exception{
		EntityManager em = emf.createEntityManager();
		TypedQuery<AdminDto> query = em.createNamedQuery("FindNameAndEmail", AdminDto.class)
				.setParameter("an", adminName).setParameter("em", email);
		AdminDto dto = query.getSingleResult();
		System.out.println(dto);
		return dto;
	}

	

}
