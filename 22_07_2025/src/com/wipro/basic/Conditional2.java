package com.wipro.basic;

public class Conditional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exercise 6: 
//			Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
//			Test Data
//			Input a number: 25
//			Expected Output :
//			Input value: 25
//			Positive number

		
		float num = -20.0f;				
	    
   
	    if (num == 0) {
            System.out.println("Zero");
        } else {
            if (num > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }

            float absValue = Math.abs(num);

            if (absValue < 1) {
                System.out.println(" and small");
            } else if (absValue > 1000000) {
                System.out.println(" and large");
            } else {
                System.out.println(" number");
            }
        }

//		exercise -7 
//	    	Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//	    	Test Data
//	    	Input floating-point number: 25.586
//	    	Input floating-point another number: 25.589
//	    	Expected Output :
//	    	They are different
//
//	    	Use math.round

		float num1 = 25.586f;
		
		float num2 = 25.589f;
		int intNum1 = Math.round(num1 * 1000);
        int intNum2 = Math.round(num2 * 1000);

        // Compare the rounded values
        if (intNum1 == intNum2) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
		
		
//      Exercise 8: 
//      Create a integer variable called num , store some value in that number;
//      Print number is even or odd based on if the number is even or odd
		
		int num3 = 7;
		System.out.println(num3 % 2 == 0 ? "even" : "odd");
		
		
		
	}

}
