package com.example.firstspring.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class ForumRespository {

	@PersistenceContext
    private EntityManager em; // manage database
	
	public Forum findOne(Integer id) {
		return em.find(Forum.class, id);
	}

   public List<Forum> findAll() {
	   Query q = em.createQuery("from Forum");
	   return q.getResultList();
   }
   
   @Transactional
   public Forum save(Forum forum) {
	   em.persist(forum);
	   return forum;
   }

}
