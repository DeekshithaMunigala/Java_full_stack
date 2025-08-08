package com.wipro.letsgoms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgoms.entity.LetsGo;
import com.wipro.letsgoms.service.LetsGoService;

@RestController
@RequestMapping("/move")
public class LetsGoController {
	
	@Autowired
	LetsGoService letsGoService;
	
	@PostMapping
	public void save(@RequestBody LetsGo letsGo) {
		letsGoService.save(letsGo);
	}
	
	@GetMapping
	public List<LetsGo> findAll(){
		return letsGoService.findAll();
	}
	
}
