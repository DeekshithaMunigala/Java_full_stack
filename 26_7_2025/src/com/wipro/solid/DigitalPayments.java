package com.wipro.solid;

import java.util.Scanner;

public class DigitalPayments {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter payment method (GooglePay / PhonePay / Paytm): ");
	        String method = sc.nextLine().trim();

	        System.out.println("Enter amount to pay: ");
	        double amount = sc.nextDouble();

	        Payment payment = null;

	        if (method.equalsIgnoreCase("GooglePay")) {
	            payment = new GooglePay();
	        } else if (method.equalsIgnoreCase("PhonePay")) {
	            payment = new PhonePe();
	        } else if (method.equalsIgnoreCase("Paytm")) {
	            payment = new Paytm();
	        } else {
	            System.out.println("Invalid payment method.");
	            sc.close();
	            return;
	        }
	        
	        System.out.println("The amount " + amount + " " + payment.pay());
	        sc.close();
		

	}

}
