package com.wipro.firstboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.firstboot.entity.User;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/user")
public class ResgistrationController {
	
	@GetMapping("/registration") 
	String showUserLogin(Model m) {
		return "registration";
	}
	
	@PostMapping("/testsubmit")
	String submitTestLoginForm(@ModelAttribute("regdata") User user,Model m)
	{
		 System.out.println("Registration Submit");
		 System.out.println(user);
		return "usersuccess";
	}
	
}
