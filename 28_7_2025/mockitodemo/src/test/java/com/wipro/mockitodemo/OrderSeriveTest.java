package com.wipro.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class OrderSeriveTest {

	@Test
	void placeOrderTest() {
		OrderService orderService = mock(OrderService.class);
		when(orderService.placeOrder("ORD-01")).thenReturn("Successful");

		assertEquals(orderService.placeOrder("ORD-01"), "Successful");
		verify(orderService).placeOrder("ORD-01");
	}

}
