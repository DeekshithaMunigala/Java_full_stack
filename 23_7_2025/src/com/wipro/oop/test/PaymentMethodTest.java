package com.wipro.oop.test;

import com.wipro.oop.Gpay;
import com.wipro.oop.PaymentMethodOps;
import com.wipro.oop.PhonePay;

public class PaymentMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethodOps payment = new PhonePay();
		payment.pay(70000);
	}

}
