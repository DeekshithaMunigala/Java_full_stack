package com.wipro.oop;

public class Shape {
	int numberOfSides;
	int numberOfCorners;
	String Color;
	
	
	public Shape() {
		
	}


	public Shape(int numberOfSides, int numberOfCorners, String color) {
		super();
		this.numberOfSides = numberOfSides;
		this.numberOfCorners = numberOfCorners;
		Color = color;
	}


	public int getNumberOfSides() {
		return numberOfSides;
	}


	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}


	public int getNumberOfCorners() {
		return numberOfCorners;
	}


	public void setNumberOfCorners(int numberOfCorners) {
		this.numberOfCorners = numberOfCorners;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	@Override
	public String toString() {
		return "Shape [numberOfSides=" + numberOfSides + ", numberOfCorners=" + numberOfCorners + ", Color=" + Color
				+ "]";
	}
	
	
	
}
