package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.Customer;



@Repository
@Transactional
public class CustomerDAOjpaImpl implements CustomerDAO{

	
	
	
	@Autowired
	 EntityManager em;
	
	@Override
	public Customer save(Customer toBesaved) {
		// TODO Auto-generated method stub
		
		
		em.persist(toBesaved);
		return toBesaved;
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		
		
		return em.find(Customer.class,id);
		
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		
		Query q= em.createQuery("select c from Customer as c ");
		List<Customer> all= q.getResultList();
		return all;
	}

	@Override
	public List<Customer> findByFirstName(String firstName) {
		Query q = em.createQuery("select c from Customer c where c.firstname=:fnParam");
		q.setParameter("fnParam", firstName);
		return q.getResultList();
		
		
		//return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		
		Customer c= em.find(Customer.class,id);
		em.remove(c);
		
		
	}

}
