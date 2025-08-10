package com.wipro.stream;



public class FoodItem {

	String foodName;
	String cuisine;
	String foodType;
	double price;
	
	
	
	public FoodItem(String foodName, String cuisine, String foodType, double price) {
		super();
		this.foodName = foodName;
		this.cuisine = cuisine;
		this.foodType = foodType;
		this.price = price;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCuisine() {
		return cuisine;
	}


	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	public int compareTo(FoodItem other) {
        // Default comparison by price
        return Double.compare(this.price, other.price); // Ascending order
    }


	@Override
	public String toString() {
		return "FoodItem [foodName=" + foodName + ", price=" + price + ", cuisine=" + cuisine + ", foodType=" + foodType
				+ "]";
	}
	
	
	

}
