package com.wipro.weather.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.weather.dto.MobileDTO;
import com.wipro.weather.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	
	@PostMapping
	String addMobile(@RequestBody MobileDTO mobile) {
		mobileService.save(mobile);
		return "Mobile data added successfully";
	}
	
	@GetMapping
	List<MobileDTO> findAll() {
		 return mobileService.findAll();
	}
	
	@PutMapping("{id}")
	void updateMobile(@PathVariable int id, @RequestBody MobileDTO mobile) {
		mobile.setId(id);  
		mobileService.updateMobile(mobile);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMobile(@PathVariable int id) {
	    System.out.println("Deleting mobile with id: " + id);
	    mobileService.deleteMobile(id);
	}

}
