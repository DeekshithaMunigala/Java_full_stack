package com.wipro.anonymous.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionListStringsTest {

	public static void main(String[] args) {
		
		
		
		Function<List<String>, List<Integer>> lengthOfString = (list) -> {
		    List<Integer> li = new ArrayList<>();
		    for (String word : list) {
		        li.add(word.length());
		    }
		    return li;
		};
		
		List<String> stringList = Arrays.asList("Jayanta", "Amit", "Vasu");
		System.out.println(lengthOfString.apply(stringList));


	}

}
