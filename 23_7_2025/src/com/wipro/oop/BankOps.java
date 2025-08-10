package com.wipro.oop;

public interface BankOps {
	
	void deposit(double amount, String accNumber);
	double withdrew(double amount, String accNumber);
	
	default void thankyouMessage() {
		System.out.println("Thankyou");
	}

}
