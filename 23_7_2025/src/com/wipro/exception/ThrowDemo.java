package com.wipro.exception;

import java.util.Scanner;

public class ThrowDemo {
	
	public static int changeCurrency(int number) throws NumberFormatException {
        if (number == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return number * 80;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to convert currency: ");
		int input = sc.nextInt();
		
		try {
			
			int result = changeCurrency(input);
			System.out.println("Converted currency : " + result);
			
		} catch(NumberFormatException e) { //catch(Execption e) will also give the same output
			
			System.out.println("Exception caught : " + e.getMessage());
			
		}

	}
	
	

}
