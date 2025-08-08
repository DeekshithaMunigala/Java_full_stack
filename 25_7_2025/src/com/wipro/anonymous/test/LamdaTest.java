package com.wipro.anonymous.test;

import com.wipro.anonymous.Greet;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greet greet = () -> {
			System.out.println("Hello Lamda!!");
		};
		
		greet.sayHello();
	}

}
