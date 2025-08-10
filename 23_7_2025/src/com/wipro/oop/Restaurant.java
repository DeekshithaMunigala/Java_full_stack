package com.wipro.oop;

public class Restaurant {
	
	String restaurantName;
	float review;
	
	
	// Default Constructur
	public Restaurant() {
		
	}
	
	public Restaurant(String restaurantName, float review) {
		super();
		this.restaurantName = restaurantName;
		this.review = review;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public float getReview() {
		return review;
	}

	public void setReview(float review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", review=" + review + "]";
	}

	
	

}
