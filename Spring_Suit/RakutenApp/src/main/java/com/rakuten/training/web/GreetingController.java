package com.rakuten.training.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.domain.Greeting;

@RestController
public class GreetingController {
	
	List<Greeting> allGreetings;
	
	@PostConstruct
	public void initialize()
	{
		allGreetings = new ArrayList<>();
		
		Greeting g1= new Greeting("morning","hello good morning");
		Greeting g2= new Greeting("Afternoon", "good");
		allGreetings.add(g1);
		allGreetings.add(g2);
	}
	
	@GetMapping("/greetings")
	public List<Greeting> getAllGreeting()
	{
		return allGreetings;
	}
	
	

}
