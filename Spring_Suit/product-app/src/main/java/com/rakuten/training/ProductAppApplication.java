package com.rakuten.training;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.SpringCacheAnnotationParser;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;
import com.rakuten.training.ui.ProductConsoleUi;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) throws IllegalAccessException {
		
		ApplicationContext springContainer=
		SpringApplication.run(ProductAppApplication.class, args);
		
		//ProductConsoleUi ui =springContainer.getBean(ProductConsoleUi.class);// new ProductConsoleUi();

		
		//ui.createProductWithUI();
		
		//TestCode.testFullProductDao(springContainer);
		//TestCode.testFullCustomerDao(springContainer);
		
	//	TestCode.testProductRepository(springContainer);
		
		
	}



}
