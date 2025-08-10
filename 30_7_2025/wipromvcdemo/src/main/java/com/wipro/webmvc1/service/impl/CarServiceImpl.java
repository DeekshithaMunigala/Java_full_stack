package com.wipro.webmvc1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.webmvc1.service.CarService;
import com.wipro.webmvc1.service.repo.CarRepo;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepo carRepo;

	@Override
	public List<String> getCartList() {
		
		return carRepo.getCarList();
	}

}
