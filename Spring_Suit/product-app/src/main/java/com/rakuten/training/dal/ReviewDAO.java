package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewDAO {

	
	
	public Review addView(Review r,int pid);
	public List<Review> findByProduct(int pid);
}
