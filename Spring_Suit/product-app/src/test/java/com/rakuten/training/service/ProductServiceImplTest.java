package com.rakuten.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rakuten.training.dal.ProductDAOInMemImpl;
import com.rakuten.training.domain.Product;

class ProductServiceImplTest {

	@Test
	void addProduct_Must_Return_Valid_When_Qoh_Is_GTE_100000() throws IllegalAccessException {
		
//		Product objUnderTest= new Product();

		
		ProductServiceImpl objUnderTest= new ProductServiceImpl();
		Product arg= new Product("test", 10000, 10);
		
		ProductDAOInMemImpl doubleForProductDAO=new ProductDAOInMemImpl();
		objUnderTest.setDao(doubleForProductDAO);
		// The bean was not initiated so we had get the bean set through an alternative dao obj.
		int id=objUnderTest.addProduct(arg);
		
		assertTrue(id>0);
		
		//fail("Not yet implemented");
	}

}
