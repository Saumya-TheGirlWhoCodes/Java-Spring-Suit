package com.rakuten.training.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;

class ProductServiceImplTest_WithMockito {

	@Test
	void addproduct_Must_Retrun_Valid_Id_When_Product_GTE_10000() throws IllegalAccessException {
		
		
		///arrange
		
		ProductServiceImpl objUndertest= new ProductServiceImpl();
		Product arg= new Product("test", 5, 10000);
		
		
		
		ProductDAO mockDAo= Mockito.mock(ProductDAO.class);
		
		Product returnedByMOck= new Product("test",10000,5);
		returnedByMOck.setId(1);
	
		Mockito.when(mockDAo.save(arg)).thenReturn(returnedByMOck);
		
		
		objUndertest.setDao(mockDAo);
		
		//act
		int id= objUndertest.addProduct(arg);
		
		
		
		
		//assert
		assertTrue(id>0);
		
	}
	
	@Test
	void removeProduct() throws IllegalAccessException
	{
		ProductServiceImpl objUndertest= new ProductServiceImpl();
		
		int inToTest=1;
		
		
		
		ProductDAO mockDAO=Mockito.mock(ProductDAO.class);
		Product returnedByMock= new Product("test", 1, 100);
		returnedByMock.setId(inToTest);
		
		Mockito.when(mockDAO.findbyId(inToTest)).thenReturn(returnedByMock);
		
		objUndertest.setDao(mockDAO);
		
		
		objUndertest.removeExisting(inToTest);
		
		Mockito.verify(mockDAO).deleteById(inToTest);
		
		
		
		
	}

}
