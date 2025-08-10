package com.wipro.methodrefrenceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;


public class StringSort {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("jhon", "amit", "vasu", "raj");
		
		List<String> sortedNames = names.stream()
				.sorted(String::compareTo)
				.collect(Collectors.toList());
		
		names.stream()
		.map(StringUtils::capitalize)
		.forEach(System.out::println);
		
		System.out.println("Sorted names : ");
		sortedNames.forEach(System.out::println);
		
		
		
		
	}

}
