package com.rakuten.training.ui;

import java.util.Scanner;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;
import com.rakuten.training.service.ProductServiceImpl;

public class ProductConsoleUi {

	ProductService service= new ProductServiceImpl();
	public void createProductWithUI() throws IllegalAccessException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name");
		String name= s.nextLine();
		System.out.println("Enter the price");
		float price=Float.parseFloat(s.nextLine());
		System.out.println("enter the Qoh");
		int qoh= Integer.parseInt(s.nextLine());
		
		
		Product p= new Product(name, price, qoh);
		int id=service.addProduct(p);
		
		System.out.println("Created Product with ID: "+id);
		
		
	}

}
