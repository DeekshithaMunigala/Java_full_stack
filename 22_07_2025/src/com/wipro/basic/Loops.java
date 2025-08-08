package com.wipro.basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		exercise-9
//		Prints all even numbers between 0 to 10 using for loop

		for(int i = 0; i<=10; i++) { // alternative way for(int i = 0; i<=10; i = i+2)
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		int i = 10;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		
//		exercise - 10
//		print the sum of all the even numbers between 1 and 100
//		int sum = 0;
//		
//		for(int i = 0; i<=100; i++) {
//			if(i%2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

	}

}
