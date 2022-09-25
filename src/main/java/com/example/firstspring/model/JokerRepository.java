package com.example.firstspring.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


@Repository
public class JokerRepository {
	@PersistenceContext
        private EntityManager em; // manage database
	
	   public List<Joker> findAll() {
		   Query q = em.createQuery("from Joker");
		   return q.getResultList();
	   }
	   
}
