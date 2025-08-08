package com.wipro.anonymous;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOps savingAcc = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println("Saving Account : " + amount);
			}
			
		};
		
		savingAcc.deposit(200000);
		
		BankOps currentAcc = new BankOps() {

			@Override
			public void deposit(double amount) {
				
				System.out.println("Current Account : " + amount);
			}
			
		};
		
		currentAcc.deposit(700000);
		
		
		
		
	}

}
