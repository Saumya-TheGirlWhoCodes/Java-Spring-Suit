package com.rakuten.training.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.dal.CustomerDAO;
import com.rakuten.training.domain.Customer;
import com.rakuten.training.domain.Product;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO dao;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		
		return dao.findAll();
	}
	
	
	@PostMapping("/customers")
	public ResponseEntity saveNewCustomer(@RequestBody Customer toBeSaved )
	{
		try {
			Customer c = dao.save(toBeSaved);
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(URI.create("/products/" + c));
			return new ResponseEntity<>(toBeSaved, headers, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	@GetMapping("customers/{id}")
	public ResponseEntity getCustomerById(@PathVariable("id") int id)
	{
	
		Customer c= dao.findById(id);
		 
		if(c!=null)
		{
			return new ResponseEntity<Customer>(c,HttpStatus.OK);
			
		}
		else {
			
			
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
		
		
	}
	
	
	@DeleteMapping("customers/{id}")
	public ResponseEntity deleteCustomer(@PathVariable int id)
	{
		
		 dao.deleteById(id);
		 
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	/// the below code not working fine . u have check with pradeep .rest all working fine .
	@GetMapping("customers/{firstname}")
	public ResponseEntity getCustomerByFirstName(@PathVariable String firstname)
	{
		List<Customer> c= dao.findByFirstName(firstname);
		
	//	if(c!=null)
	//	{			
		return new ResponseEntity(c,HttpStatus.OK);
		
	//}else
	//{
	//	return new ResponseEntity(HttpStatus.NOT_FOUND);
	//}

}
	
	
}
