package com.wipro.oop;

public class Citi implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("Money " + amount + " is deposited in the account " + accNumber);

	}

	@Override
	public double withdrew(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("Money " + amount + " is withdrew from the account " + accNumber);
		return 0;
	}

}
