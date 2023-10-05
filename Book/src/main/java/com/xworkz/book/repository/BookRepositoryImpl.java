package com.xworkz.book.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.book.dto.BookDto;

@Repository
public class BookRepositoryImpl implements BookRepository{
	
	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveBook(BookDto dto) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		try {
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}
	}

	@Override
	public BookDto findByBookName(String bookName) throws Exception {
		EntityManager em = emf.createEntityManager();
		TypedQuery<BookDto> query = em.createNamedQuery("findByBookName", BookDto.class)
				.setParameter("bn", bookName);
		BookDto dto = query.getSingleResult();
		return dto;
	}

	@Override
	public List<BookDto> readAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("readAll");
		List<BookDto> list = query.getResultList();
		return list;
	}

}
