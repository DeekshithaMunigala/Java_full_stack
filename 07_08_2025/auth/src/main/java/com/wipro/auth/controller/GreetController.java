package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class GreetController {
	
	
	@GetMapping("/greet")
	String greet() {
		return "Hello from greet";
	}
	
	@GetMapping("/hello")
	String sayHello() {
		return "Hello World !!!";
	}
	
}
