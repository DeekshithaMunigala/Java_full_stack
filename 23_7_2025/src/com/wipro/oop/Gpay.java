package com.wipro.oop;

public class Gpay implements PaymentMethodOps {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The amount recieved " + amount + " using Gpay");
	}

}
