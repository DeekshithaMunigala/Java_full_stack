package com.wipro.weather.service;

import java.util.List;


import com.wipro.weather.dto.MobileDTO;


public interface MobileService {
	
	void save(MobileDTO mobile);
	List<MobileDTO> findAll();
	void updateMobile(MobileDTO mobile);
	void deleteMobile(int id);

}
