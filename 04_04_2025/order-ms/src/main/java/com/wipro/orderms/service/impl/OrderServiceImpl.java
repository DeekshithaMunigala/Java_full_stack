package com.wipro.orderms.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderms.dto.OrderWithPaymentDTO;
import com.wipro.orderms.dto.Payment;
import com.wipro.orderms.entity.Order;
import com.wipro.orderms.repo.OrderRepo;
import com.wipro.orderms.service.OrderService;
import com.wipro.orderms.service.PaymentConnectService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	PaymentConnectService paymentConnectService;

	@Override
	@CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallBack")
	public void save(Order order) {
		order.setOrderStatus("I");
		Order saveOrder = orderRepo.save(order);
		
		Payment payment = new Payment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getOrderValue());
		payment.setPaymentStatus(false);
		
//		try {
//			RestTemplate rest = new RestTemplate();
//	        String url = "http://localhost:9011/payment";
			String url = "http://paymentms/payment"; // when using eureka we using ms name instead of localhost and port number
//	        ResponseEntity<Payment> response = restTemplate.postForEntity(url, payment, Payment.class);
			ResponseEntity<Payment> savedPayment = paymentConnectService.savePaymentData(payment);

	        if (savedPayment.getStatusCode().is2xxSuccessful()) {
	            saveOrder.setOrderStatus("P"); 
	        } 
//		} catch(Exception ex) {
//			saveOrder.setOrderStatus("C");
//		}
		
		orderRepo.save(saveOrder);

	}

	@Override
	@CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallBack")
	public List<OrderWithPaymentDTO> findAll() {
		
		List<Order> orders = orderRepo.findAll();

	    return orders.stream().map(order -> {
	        OrderWithPaymentDTO dto = new OrderWithPaymentDTO();
	        dto.setOrderNumber(order.getOrderNumber());
	        dto.setOrderValue(order.getOrderValue());

//	        try {
	            
//	            String url = "http://paymentms/payment/order/" + order.getId();
//	            Payment[] payments = restTemplate.getForObject(url, Payment[].class);
//
//	            if (payments != null) {
//	                dto.setPayment(Arrays.asList(payments));
//	            }
	        	
		        	List<Payment> payments = paymentConnectService.getPaymentsByOrderId(order.getId());
	            dto.setPayment(payments != null ? payments : List.of());
	            
//	        } catch (Exception e) {
//	            dto.setPayment(Collections.emptyList()); 
//	        }

	        return dto;
	    }).collect(Collectors.toList());
	}
	
//	void handleFallBack(Throwable t) {
//		System.out.println("---System is down---");
//	}
	
	// For save(Order order)
	public void handleFallBack(Order order, Throwable t) {
	    System.out.println("---System is down. Could not save order---");
	    // maybe mark order as failed in DB or log it
	}

	// For findAll()
	public List<OrderWithPaymentDTO> handleFallBack(Throwable t) {
	    System.out.println("---System is down. Returning empty order list---");
	    return Collections.emptyList();
	}

}
