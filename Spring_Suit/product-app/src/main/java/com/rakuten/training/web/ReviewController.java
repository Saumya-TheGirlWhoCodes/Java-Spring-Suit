package com.rakuten.training.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.dal.ReviewDAO;
import com.rakuten.training.domain.Review;

@RestController
public class ReviewController {
	
	
	@Autowired
	ReviewDAO rdao;
	
	@PostMapping("/products/{id}/reviews")
	public ResponseEntity addReviewtoProduct(@PathVariable("id") int pid, @RequestBody Review toBeAdded)
	
	{
		
		Review added= rdao.addView(toBeAdded,pid);
		
		
		return new ResponseEntity<Review>(added, HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("/products/{id}/reviews")
	public List<Review> getviewForproduct(@PathVariable("id") int pid)
	{
		return rdao.findByProduct(pid);
		
	}

}
