package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.Product;

@Repository

@Transactional
public class ProductDAOJpaImpl implements ProductDAO {

	@Autowired
	EntityManager em;
	
	
//	
//	public void setEm(EntityManager em) {
//		this.em = em;
//	}
	
	
	@Override
	public Product save(Product toBeSaved) {
	
		em.persist(toBeSaved);
		
		
		return toBeSaved;
	}
	
	

	@Override
	public Product findbyId(int id) {
		// TODO Auto-generated method stub
		
		 return em.find(Product.class,id);
		
	}

	
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Query q= em.createQuery("select p from Product as p");// where p.price<123
		return q.getResultList();
		//return null;
	}
	
	

	@Override
	public void deleteById(int id) {
		
		Product p= em.find(Product.class, id);
		em.remove(p);
		
	}
	
	
	

}
