package com.rakuten.training;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.CustomerDAO;
import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.repos.ProductRepository;
import com.rakuten.training.domain.Customer;
import com.rakuten.training.domain.Product;

public class TestCode {

	
	public static void testFullProductDao(ApplicationContext springContainer ) {
		
		
		ProductDAO dao=springContainer.getBean(ProductDAO.class);
		
		Product aProduct=new Product("test",12222,10000);
		Product saved = dao.save(aProduct);
		System.out.println("saved");
		List<Product> all=dao.findAll();
		System.out.println("there are"+all.size()+"products");
		
		System.out.println("removing");
		dao.deleteById(saved.getId());
		
		
	}
	
	
	public static void testFullCustomerDao(ApplicationContext springContainer)
	
	{

		CustomerDAO dao=springContainer.getBean(CustomerDAO.class);
		
		Customer aCustomer=new Customer("jeevan","dalin","jeevan@gmail.com");
				
				
				

				
		//	Customer  saved =
					dao.save(aCustomer);

	System.out.println("saved");
	List<Customer> all=dao.findAll();
		System.out.println("there are"+all.size()+"products");
		
	List<Customer> l= dao.findByFirstName("jeevan");
	System.out.println("");
	//	System.out.println("removing");
	//	dao.deleteById(saved.getId());
		
		
		
		
		
	}


	public static void testProductRepository(ApplicationContext springContainer) {
		
		
		ProductRepository repo= springContainer.getBean(ProductRepository.class);
		
		
		Product p= new Product("repo",5,10000);
		
		Product saved =repo.save(p);
		
		System.out.println("saved"+saved.getId());
		
	}
	
	
	
	
}
