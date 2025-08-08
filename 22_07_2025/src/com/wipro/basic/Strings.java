package com.wipro.basic;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exercise 18:	 
//	   Create a java program to check if the given string is a palindrome or not . Example of palindromes are “Madam”,”Rotor”,”Racecar”. You are not allowed to use anything other than the String class and normal for
		
//		String str = "madam";
//		String str1 = "";
//		
//		for(int i=str.length()-1; i>= 0; i--) {
//			str1 += str.charAt(i);
//		}
//		
//		System.out.println(str1);
//		
//		if(str.equalsIgnoreCase(str1)) {
//			System.out.println("Is a palindrome");
//		} else {
//			System.out.println("Is not a palindrome");
//		}
		
//		Exercise 19:
//		Rewrite Ex 18 with StringBuilder class
//		
//		StringBuilder sb = new StringBuilder("madam");
//		sb.reverse();
//		System.out.println(sb);
		
		
//		Exercise 20:
//		String Anagram: Check if two strings are anagrams (contain the same characters in a different order). Examples "listen" and "silent“"earth" and "heart", or "race" and "care".  

//		String str1 = "listen";
//		String str2 = "silent";
//		
//		if(str1.length() != str2.length()) {
//			System.out.println("Not anagram");
//		} else {
//		
//			char[] arr1 = str1.toCharArray();
//			char[] arr2 = str2.toCharArray();
//			
//			Arrays.sort(arr1);
//			Arrays.sort(arr2);
//		
//			if(Arrays.equals(arr1, arr2)) {
//				System.out.println("Anagrams");
//			} else {
//                System.out.println("Not anagrams.");
//            }
//		
//		}
		
//		Array sorting with methods**********
//		int[] arr= {21, 17, 14, 15,19,4,5};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Exercise 21:
//		Count Vowels and Consonants: Count the number of vowels and consonants in a given string.
		
//		String str = "Hello world";
//		
//		int vowels = 0;
//		int consonants = 0;
//		
//		str = str.toLowerCase();
//		
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if((ch >= 'a') && (ch <= 'z')) {
//				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					vowels++;
//				} else {
//					consonants++;
//				}
//			}
//		}
//		
//		System.out.println("Vowels : " + vowels);
//		System.out.println("Consonants : " + consonants);
		
		
//		Exercise 22:
//		Find Shortest Word in a String: Identify the shortest word in a string.
		
//		String str = "biggest fandom in the world";
//		String[] words= str.split(" ");
//		
//		String shortest = words[0];
//		
//		for(String word:words) {
//			if(word.length() < shortest.length()) {
//				shortest = word;
//			}
//		}
//		
//		System.out.println(shortest);
		
		
	}

}
