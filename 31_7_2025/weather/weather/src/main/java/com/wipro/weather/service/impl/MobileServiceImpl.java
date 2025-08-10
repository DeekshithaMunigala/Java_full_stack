package com.wipro.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.weather.dto.MobileDTO;
import com.wipro.weather.repo.MobileRepo;
import com.wipro.weather.service.MobileService;


@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	MobileRepo mobileRepo;

	@Override
	public void save(MobileDTO mobile) {
		mobileRepo.save(mobile);

	}

	@Override
	public List<MobileDTO> findAll() {
		
		return mobileRepo.findAll();
	}

	@Override
	public void updateMobile(MobileDTO mobile) {
		mobileRepo.updateMobile(mobile);
	}

	@Override
	public void deleteMobile(int id) {
		mobileRepo.deleteMobile(id);
	}

}
