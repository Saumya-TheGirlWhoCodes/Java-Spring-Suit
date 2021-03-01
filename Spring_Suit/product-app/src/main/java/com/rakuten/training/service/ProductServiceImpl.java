package com.rakuten.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.ProductDAOInMemImpl;

import com.rakuten.training.domain.Product;

@Service

public class ProductServiceImpl implements ProductService {

	ProductDAO dao; // =new ProductDAOInMemImpl(); 
	
	@Autowired
	public void setDao(ProductDAO dao) { //dao is a property now because of this method
		this.dao = dao;
	}
	
	@Override
	public int addProduct(Product toBeAdded) throws IllegalAccessException
	{
		if(toBeAdded.getPrice()* toBeAdded.getQuantity()>=10000)
		{
			
			Product added= dao.save(toBeAdded);
			return added.getId();
			
		}else
		{
			throw new IllegalAccessException("error");
		}
	}
	
	@Override
	public void removeExisting(int id) throws IllegalAccessException {
		
		Product existing=dao.findbyId(id);
		if(existing.getPrice()* existing.getQuantity()<10000)
		{
			dao.deleteById(id);
		}else
		{
			throw new IllegalAccessException("error");
			
		}
	}

	@Override
	public Product findbyId(int id) {
		return dao.findbyId(id);
	}

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}
	
	
}
