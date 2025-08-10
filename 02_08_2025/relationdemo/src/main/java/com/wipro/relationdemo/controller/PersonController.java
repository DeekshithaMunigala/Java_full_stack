package com.wipro.relationdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService personService;
	
	@PostMapping
	void save(@RequestBody Person person) {
		personService.save(person);
	}
	
	@GetMapping
	List<Person> findAll() {
		return personService.findAll();
	}
	
	
}
