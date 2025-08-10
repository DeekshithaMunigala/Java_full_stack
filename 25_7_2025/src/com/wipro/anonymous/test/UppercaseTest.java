package com.wipro.anonymous.test;

import java.util.function.Predicate;

public class UppercaseTest {

	public static void main(String[] args) {
		Predicate<String> isUppercase = str -> str.equals(str.toUpperCase());
		Predicate<String> isLowercase = str -> str.equals(str.toLowerCase());
		
		String word = "hello";
		
		
		System.out.println(isUppercase.test(word) ? "Uppercase" : "Lowercase");
		System.out.println(isLowercase.test(word)? "Lowercase" : "Uppercase");

	}

}
