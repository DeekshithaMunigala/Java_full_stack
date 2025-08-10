package com.wipro.oop.test;

import com.wipro.oop.Citi;
import com.wipro.oop.HDFC;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC user = new HDFC();
		user.deposit(400000d, "984624163902");
		user.thankyouMessage();
		
		Citi userCiti = new Citi();
		userCiti.withdrew(30000d, "673492094637");
		userCiti.thankyouMessage();
		
	}

}
