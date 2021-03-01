package com.rakuten.training.dal.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.rakuten.training.domain.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{
	
	
	public List<Product> findByPrice(float p); /// select p from product where p.price=:p
	public List<Product> findByPriceLessThan(float p);// select p from product where p.price<:p
	

}
