package com.wipro.weather.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.wipro.weather.dto.MobileDTO;

@Repository
public class MobileRepo {
	
	List<MobileDTO> mobiles = new CopyOnWriteArrayList<>();
	
	public void save(MobileDTO mobile) {
		mobiles.add(mobile);
	}
	
	public List<MobileDTO> findAll() {
		return mobiles;
	}
	
	public void updateMobile(MobileDTO mobile) {
		Optional<MobileDTO> foundMobile = mobiles.stream().filter(m -> m.getId() == (mobile.getId())).findFirst();
		
		if(foundMobile.isPresent()) {
			MobileDTO existing = foundMobile.get();
			existing.setMake(mobile.getMake());
			existing.setModelNumber(mobile.getModelNumber());
			existing.setPrice(mobile.getPrice());
		} else {
			System.out.println("Mobile not found : " + mobile.getId());
		}
		
	}
	
	public void deleteMobile(int id) {
		
		for(int i=0; i<mobiles.size(); i++) {
			if(mobiles.get(i).getId() == (id)) {
				mobiles.remove(i);
				
				System.out.println("Mobile is removed");
			}
		}
	}
	

}
