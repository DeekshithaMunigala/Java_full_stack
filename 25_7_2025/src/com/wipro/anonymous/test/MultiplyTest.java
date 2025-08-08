package com.wipro.anonymous.test;

import com.wipro.anonymous.Multiply;

public class MultiplyTest {

	public static void main(String[] args) {
		
		Multiply multiplyFn = (a, b) -> {
			return a * b;
		};
		
		int result = multiplyFn.multiply(7, 2);
		System.out.println("The result is : "+ result);

	}

}
