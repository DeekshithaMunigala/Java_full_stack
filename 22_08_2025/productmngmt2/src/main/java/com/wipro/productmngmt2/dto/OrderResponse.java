package com.wipro.productmngmt2.dto;

import java.time.LocalDateTime;

import com.wipro.productmngmt2.entity.OrderHeader;

import lombok.Data;

@Data
public class OrderResponse {
	
	private Long id;
    private String productName;
    private Integer qty;
    private LocalDateTime orderDate;

    public OrderResponse(OrderHeader oh) {
        this.id = oh.getId();
        this.productName = oh.getProduct().getName();
        this.qty = oh.getQty();
        this.orderDate = oh.getOrderDate();
    }

}
