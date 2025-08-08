package com.wipro.letsgoms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgoms.entity.LetsGo;
import com.wipro.letsgoms.repo.LetsGoRepo;
import com.wipro.letsgoms.service.LetsGoService;

@Service
public class LetsGoServiceImpl implements LetsGoService {
	
	@Autowired
	LetsGoRepo letsGoRepo;

	@Override
	public void save(LetsGo letsGo) {
		
		letsGoRepo.save(letsGo);
	}

	@Override
	public List<LetsGo> findAll() {
		
		return letsGoRepo.findAll();
	}

}
