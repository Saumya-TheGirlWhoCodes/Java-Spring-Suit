package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;


@Repository
@Transactional
public class reviewDAOJpaImpl implements ReviewDAO {

	
	@Autowired
	EntityManager em;
	
	@Override
	public Review addView(Review r, int pid) {
		
		
		Product p= em.find(Product.class, pid);
		r.setProduct(p);
		em.persist(r);
		return r;
	}

	@Override
	public List<Review> findByProduct(int pid) {
		
		
		Query q= em.createQuery("select r from review as r where r.Product.id=:x");
		q.setParameter("x",pid);
		
		
		return q.getResultList();
	}

	
	
	
}
