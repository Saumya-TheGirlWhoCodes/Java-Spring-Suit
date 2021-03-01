package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Product;

public interface ProductDAO {

	
	public Product save( Product toBeSaved);
	public Product findbyId(int id);
	public List<Product> findAll();
	public void deleteById(int id);



}

