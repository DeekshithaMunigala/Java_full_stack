package com.wipro.anonymous.test;


import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java program that uses Predicate to check if a given string is a palindrome.
		
		Predicate<String> isPalindrome = str -> {
				int len = str.length();
				
				for(int i=0; i<= len/2; i++) {
					if(str.charAt(i) != str.charAt(len - 1 - i)) {
						return false;
					}
				}
				return true;
		};
		
		String input = "radar";
		
		if(isPalindrome.test(input)) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}
	

	}

}
