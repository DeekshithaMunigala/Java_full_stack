package com.wipro.basic;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] numbers = {1,2,3,4};
//		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		Exercise 11:
//		Create an array of integers Initialize the array with some random numbers. Using a for loop  modify each value so that the new value becomes twice the older value. Print the new values using a second for loop.
//		
//		int[] arr = {7, 9, 3, 4, 2};
//		
//		for(int i=0; i<arr.length; i++) {	
//			arr[i] = arr[i] * 2;
//		}
//		
//		for(int i=0; i<arr.length; i++) {	
//			System.out.println(arr[i]);
//		}
		
//		Exercise 12: Find out the largest number in  the following array {100,67,98,678,45,123}
		
//		int[] data = {100,67,98,678,45,123};
//		
//		int hightestNum = 0;
//		
//		for(int i=0; i<data.length; i++) {
//			if(data[i] > hightestNum) {
//				hightestNum = data[i];
//			}
//		}
//		
//		System.out.println(hightestNum);
		
//		Exercise 13 :
//			Find the second largest element in an array of integers.
//			Input: An integer array arr.
//			Output: The second largest element in the array.
//			Example:
//			Input: [10, 5, 20, 8, 15]
//			Output: 15
		
//		int[] arr1 = {10, 5, 20, 8, 15};
//		int hightestNum = 0;
//		int secondHightestNum = 0;
//		
//		for(int i=0; i<arr1.length; i++) {
//			if(arr1[i] > hightestNum) {
//				secondHightestNum = hightestNum;
//				hightestNum = arr1[i];
//			} else if(arr1[i] > secondHightestNum) {
//				secondHightestNum = arr1[i];
//			}
//		}
//		
//		System.out.println(secondHightestNum);
//		
//		Exercise 14:
//			Remove duplicates from a sorted array and return the length of the resulting array.
//			Input: A sorted integer array arr.
//			Output: Length of the array after removing duplicates.
//			Example:
//			Input: [1, 1, 2, 2, 3, 4, 4, 5]
//			Output: 5 (resulting array: [1, 2, 3, 4, 5])
		
//		int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};
//		
//		int[] newArr = new int[5];
//		
//		for(int i=0; i<numbers.length; i++) {
//			if(newArr[i] != numbers[i]) {
//				newArr[i] = numbers[i];
//			}
//		}
//		
//		System.out.println(newArr.length);
//		
//		Exercise 15:
//			 
//			Find the pair of elements in an array that sum to a given target.
//			Input: An integer array arr and a target integer target.
//			Output: Indices or values of the pair of elements that sum to target. Assume one pair exists.
//			Example:
//			Input: arr = [2, 7, 11, 15], target = 9
//			Output: [0, 1] (indices of 2 and 7)
		
//		int[] arr = {2, 7, 11, 15};
//		
//		int target = 9;
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i + 1; j < arr.length ; j++) {
//				if(arr[i] + arr[j] == target) {
//					System.out.println("pair of indicies is [" + i + "," + j + "]");
//				} else {
//					System.out.println("Pair not found");
//				}
//			}
//		}
		
		
	
//		consecutive index which is equal to target
//		int[] arr= {21, 17, 14, 15,19,4,5};
//	    int target=9;
//	    int[] output= {0,0};
//	
//	    for(int i=0;i<arr.length;i++)
//		{
//			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
//			{
//				output[0]=i;
//				output[1]=i+1;
//			}
//			
//		}
//	
//		System.out.println(output[0]+"-"+output[1]);
		
		
//		Exercise 16:
//			Reverse an array in place without using an extra array.
//			Input: An integer array arr.
//			Output: Array reversed in place.
//			Example:
//			Input: [1, 2, 3, 4, 5]
//			Output: [5, 4, 3, 2, 1]
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.print(" " + arr[i]);
//		}
		
		
////		Enum 
//		enum Day {
//			SUN,
//			MON,
//			TUE,
//			WED,
//			THU,
//			FRI,
//			SAT
//		}
		
//		Day day=Day.Mon;
//		if(day==Day.Mon)
//		{
//			System.out.println("Monday");
//		}
		
//		this is forEach
//		for(Day d:Day.values())
//		{
//			System.out.println(d);
//		}
		
//		Exercise 17:
//			Create an enum called Month having values like JANUARY,FEBRURAY…DECEMBER
//			Using for each print all the possible Month values.
//			Create a variable called month of Type Month assign FEBRURAY to it and check using if condition if the assigned month isFEBRURAY or not.
		
		enum Month {
			JAN,
			FEB,
			MARCH,
			APRIL,
			MAY,
			JUNE,
			JULY,
			AUG,
			SEP,
			OCT,
			NOV,
			DEC
		}
		
		for(Month a:Month.values()) {
			System.out.println(a);
		}
		
		Month month = Month.FEB;
		
		if(month == Month.FEB) {
			System.out.println("Februray");
		}
		
		
		
		
	}

	
}
