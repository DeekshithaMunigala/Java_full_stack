package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Jayanta", "Jack", "Jhon","Amit");
	
		List<String> filteredNames= list
		.stream()
		.filter(name -> name.toLowerCase().contains("ja"))
		.collect(Collectors.toList());
		
		System.out.println(filteredNames);
	}

}
