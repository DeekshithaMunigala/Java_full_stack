package com.wipro.oop.test;

import com.wipro.oop.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		
		rectangle.setNumberOfSides(4);
		rectangle.setNumberOfCorners(4);
		rectangle.setColor("Blue");
		System.out.println(rectangle);
	}

}
