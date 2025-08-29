package com.wipro.productms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.productms.dto.OrderEvent;
import com.wipro.productms.service.ProductService;

@Service
public class ConsumerConfigApp {

    @Autowired
    private ProductService productService;

    @KafkaListener(topics = "order-events", groupId = "product-group")
    public void consumeOrderEvent(OrderEvent event) {
        try {
            if ("ORDER_CREATED".equals(event.getType())) {
                productService.updateProductQuantity(event.getProductId(), event.getQuantity());
            } else if ("ORDER_CANCELLED".equals(event.getType())) {
                productService.updateProductQuantity(event.getProductId(), -event.getQuantity());
            }
        } catch (Exception e) {
            System.err.println("Error processing order event: " + e.getMessage());
        }
    }
}
