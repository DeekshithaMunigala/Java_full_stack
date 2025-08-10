package com.wipro.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoodITemClassTest {

	public static void main(String[] args) {
		
		FoodItem item1 = new FoodItem("Biryani", "Indian", "Non-veg", 200.0);
		FoodItem item2 = new FoodItem("Sushi", "Japanese", "Non-veg", 350.0);
		FoodItem item3 = new FoodItem("Paneer Butter Masala", "Indian", "Vegetarian", 190.0);
		FoodItem item4 = new FoodItem("Lasagna", "Italian", "Non-veg", 270.0);
		FoodItem item5 = new FoodItem("Peking Duck", "Chinese", "Non-veg", 400.0);
		FoodItem item6 = new FoodItem("Vegetable Hakka Noodles", "Chinese", "Vegetarian", 200.0);
				
		List<FoodItem> foodList = new ArrayList<>();
		foodList.add(item1);
		foodList.add(item2);
		foodList.add(item3);
		foodList.add(item4);
		foodList.add(item5);
		foodList.add(item6);
		
		List<FoodItem> chineseFood = foodList.stream()
                .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
                .collect(Collectors.toList());
		
		chineseFood.forEach(System.out::println);
		
		
		
		FoodItem chineseExpensiveFood = foodList.stream()
                .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
                .reduce((a, b) -> a.getPrice() > b.getPrice() ? a : b)
                .orElse(null);
                
		
		
		System.out.println(chineseExpensiveFood);
 
		
	}

}
