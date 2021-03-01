package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Product;

public interface ProductService {

	int addProduct(Product toBeAdded) throws IllegalAccessException;

	void removeExisting(int id) throws IllegalAccessException;

	Product findbyId(int id);

	List<Product> findAll();

}