package com.wipro.oop;

public class Dog extends Animal{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("Eating");
	}

	@Override
	public void sleeping() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping");
	}
	
	public void bark() {
		System.out.println("Barking");
	}

	@Override
	public void moving() {
		// TODO Auto-generated method stub
		System.out.println("Walking");
	}

}
