package com.wipro.oop;

public class PhonePay implements PaymentMethodOps {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The amount sent " + amount + " using phonepay");
	}

}
