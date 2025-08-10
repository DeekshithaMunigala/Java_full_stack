package com.wipro.ride.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.wipro.ride.dto.BookingResponseDTO;
import com.wipro.ride.service.RideBookingService;
import com.wipro.ride.util.AppConstant;

@Service
public class RideResponseListener {
	
	@Autowired
	RideBookingService rideBookingService;
	
	@KafkaListener(topics=AppConstant.TOPIC_RIDER_RESPONSES, groupId="ride_uber")
	public void listen(BookingResponseDTO dto) {
		System.out.println("RiderService received response: " + dto);
		rideBookingService.handleBookingResponse(dto);
	}

}
