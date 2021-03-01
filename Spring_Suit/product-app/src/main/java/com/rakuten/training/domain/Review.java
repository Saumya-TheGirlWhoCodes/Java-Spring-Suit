package com.rakuten.training.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="review")
public class Review {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	
	String reviewer;
	String reviewText;
	int rating;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="p_id")
	Product product;
	
	
	
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	


	public Review() {

	}


	public Review(String reviewer, String reviewText, int rating) {
		super();
		this.reviewer = reviewer;
		this.reviewText = reviewText;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getReviewer() {
		return reviewer;
	}


	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}


	public String getReviewText() {
		return reviewText;
	}


	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
  

}
