package com.wipro.basic;

public class ConditoonalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ex4:
//		Create a variable called shape that can hold R for Rectangle , C for Circle, S for square. Using if else print Rectangle/Cricle/Square or Other
		char shape = 'S';
		
//		if(shape == 'R') {
//			System.out.println("Rectangle");
//		} else if(shape == 'S') {
//			System.out.println("Square");
//		} else if(shape == 'C') {
//			System.out.println("Circle");
//		} else {
//			System.out.println("Unknown");
//		}
		
//		Ex5:
//		Convert if/else if to switch case statements		
		switch(shape) {
		case 'R' : 
			System.out.println("Rectangle");
			break;
		case 'C':
			System.out.println("Circle");
			break;
		case 'S':
			System.out.println("Square");
			break;
		default:
			System.out.println("Unknown");
			break;
		}

	}

}
