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
	public SongDto findBySongName(String songName) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<SongDto> query = em.createNamedQuery("findBySongName", SongDto.class);
		query.setParameter("sn", songName);
		List<SongDto> dtos = query.getResultList();

		if (!dtos.isEmpty()) {
			SongDto dto = query.getSingleResult();
			return dto;
		}
		System.out.println("No Entity Found");
		return null;
	}

	@Override
	public boolean updateArtistBySong(String artist, String songName) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("update")
				.setParameter("an", artist)
				.setParameter("sn", songName);
		int i = query.executeUpdate();

		try {
			
			if (i > 0) {
				System.out.println("Data is updated");
			em.getTransaction().commit();
				return true;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}

		return false;
	}

	@Override
	public boolean deleteByAlbum(String album) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("delete").setParameter("al", album);
		int i = query.executeUpdate();

		try {
			em.getTransaction().commit();
			if (i > 0) {
				System.out.println("Data is deleted");
				return true;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;

		} finally {
			System.out.println("Resource is closed");

			em.close();
		}
		return false;

	}

}
