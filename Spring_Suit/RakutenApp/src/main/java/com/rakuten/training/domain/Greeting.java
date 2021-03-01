package com.rakuten.training.domain;

public class Greeting {

	
	
	String timeOfDay;
	String message;
	
	
	public Greeting() {

		
	}


	public Greeting(String timeOfDay, String message) {
		super();
		this.timeOfDay = timeOfDay;
		this.message = message;
	}


	public String getTimeOfDay() {
		return timeOfDay;
	}


	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
