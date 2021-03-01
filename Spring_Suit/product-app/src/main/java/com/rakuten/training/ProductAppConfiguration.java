//package com.rakuten.training;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.rakuten.training.dal.ProductDAO;
//import com.rakuten.training.dal.ProductDAOInMemImpl;
//import com.rakuten.training.service.ProductService;
//import com.rakuten.training.service.ProductServiceImpl;
//import com.rakuten.training.ui.ProductConsoleUi;
//
//@Configuration
//
//public class ProductAppConfiguration {
//	
//	
//	@Bean
//	public ProductDAO daoobj()
//	{
//		
//		
//		ProductDAOInMemImpl dao = new ProductDAOInMemImpl();
//		 return dao;
//		 
//	}
//	
//	@Bean
//	public ProductService serviceobj()
//	{
//		ProductServiceImpl service= new ProductServiceImpl();
//		
//		service.setDao(daoobj());
//		return service;
//		
//		}
//	
//	@Bean
//	public ProductConsoleUi uiobj()
//	{
//		ProductConsoleUi ui = new ProductConsoleUi();
//		ui.setService(serviceobj());
//         return ui;
//	
//	}
//	
//
//}
