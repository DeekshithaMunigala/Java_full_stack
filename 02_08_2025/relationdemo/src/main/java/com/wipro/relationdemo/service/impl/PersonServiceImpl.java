package com.wipro.relationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.repo.PersonRepo;
import com.wipro.relationdemo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepo personRepo;
	
	@Override
	public void save(Person person) {
		personRepo.save(person);

	}

	@Override
	public List<Person> findAll() {
		
		return personRepo.findAll();
	}

	

}
