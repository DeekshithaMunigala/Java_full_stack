package com.wipro.letsgoms.service;

import java.util.List;

import com.wipro.letsgoms.entity.LetsGo;

public interface LetsGoService {
	
	void save(LetsGo letsGo);
	List<LetsGo> findAll();
}
