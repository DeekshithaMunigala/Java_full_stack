package com.wipro.test;

import com.wipro.generics.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox = new Box();
		intBox.set(7);
		System.out.println(intBox.get());
	}

}
