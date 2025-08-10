package com.wipro.paymentms.service;

import java.util.List;

import com.wipro.paymentms.entity.Payment;

public interface PaymentService {
	Payment save(Payment payment);
	List<Payment> findAll();
	Payment findById(Long id);
	Payment updateById(Long id, Payment payment);
	void deleteById(Long id);
}
