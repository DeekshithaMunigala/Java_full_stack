package com.wipro.webmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.webmvc1.service.CarService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@GetMapping("/list")
	String showCarList(Model model) {
		model.addAttribute("carList",carService.getCartList());
		return "carlist";
	}
	
}
