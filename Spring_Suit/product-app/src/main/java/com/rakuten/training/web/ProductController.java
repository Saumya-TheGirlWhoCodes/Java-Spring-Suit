package com.rakuten.training.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	
	@Autowired
	ProductService service ;
	
	
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		
		
		return service.findAll();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") int pid)
	{
		Product p= service.findbyId(pid);
	
		if(p!=null)
		{
			return new ResponseEntity<Product>(p,HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	
	
	@PostMapping("/products")
	public ResponseEntity addNewProduct(@RequestBody Product toBeAdded) 
	{
		
		try {
			int id =service.addProduct(toBeAdded);
			HttpHeaders headers= new HttpHeaders();
			headers.setLocation(URI.create("/products/"+id));
			return new ResponseEntity<>(toBeAdded,headers,HttpStatus.CREATED);
		} catch (IllegalAccessException e) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	//// the code runs fine and good. but the condition thing is missing . ie if the price*qoh is > then dont delete print 409 conflict.
	@DeleteMapping("/products/{id}")
	public ResponseEntity deleteProduct(@PathVariable("id") int id) throws IllegalAccessException
	{
		 
		    service.removeExisting(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		
	}
	
	
}
