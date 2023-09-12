package com.xworkz.spotify.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SongDto;

@Repository
public class SpotifyRepositoryImpl implements SpotifyRepository {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveSong(SongDto dto) {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			System.out.println("Data is saved");
			return true;

		}
		return false;
	}

	@Override
	public List<SongDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		List<SongDto> list = query.getResultList();
		System.out.println(list);
		return list;
	}

	@Override
	public SongDto findBySongName(String songName, Model model) throws NoResultException{
		EntityManager em = emf.createEntityManager();
		TypedQuery<SongDto> query = em.createNamedQuery("findBySongName", SongDto.class);
		query.setParameter("sn", songName);
		SongDto dto = query.getSingleResult();
		return dto;
	}

}
