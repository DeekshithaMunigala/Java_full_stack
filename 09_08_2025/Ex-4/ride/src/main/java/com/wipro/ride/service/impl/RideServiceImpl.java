package com.wipro.ride.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.ride.dto.RideDTO;
import com.wipro.ride.entity.Ride;
import com.wipro.ride.repo.RideRepo;
import com.wipro.ride.service.RideService;
import com.wipro.ride.util.AppConstants;

@Service
public class RideServiceImpl implements RideService {
	
	@Autowired
	RideRepo rideRepo;
	
	@Autowired 
	KafkaTemplate<String, Object> kafkaTemplate;

	@Override
	public void bookRide(RideDTO bookRide) {
		
		Ride book = new Ride();
		book.setFromLocation(bookRide.getFromLocation());
		book.setToLocation(bookRide.getToLocation());
		book.setDistanceKm(bookRide.getDistanceKm());
		book.setBookingTime(LocalDateTime.now());
		book.setStatus("Requested");
		
		rideRepo.save(book);
		
		kafkaTemplate.send(AppConstants.OUTGOING_TOPIC_NAME, book);
		
	}

}
