package com.wipro.relationdemo.service;

import java.util.List;

import com.wipro.relationdemo.entity.Person;

public interface PersonService {
	void save(Person person);
	List<Person> findAll();
}
