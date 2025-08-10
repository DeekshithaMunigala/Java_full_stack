package com.wipro.ride.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.ride.dto.BookingRequestDTO;
import com.wipro.ride.dto.BookingResponseDTO;
import com.wipro.ride.entity.RideBooking;
import com.wipro.ride.repo.RideBookingRepo;
import com.wipro.ride.service.RideBookingService;
import com.wipro.ride.util.AppConstant;


@Service
public class RideBookingServiceImpl implements RideBookingService {
	
	@Autowired
	RideBookingRepo rideBookingRepo;
	
	@Autowired
	KafkaTemplate<String, BookingRequestDTO> kafkaTemplate;

	@Override
	public RideBooking createBooking(RideBooking booking) {
		
		booking.setStatus("PENDING");
//		booking.setPrice(null);
		
		RideBooking saved = rideBookingRepo.save(booking);
		
		BookingRequestDTO dto = new BookingRequestDTO();
		dto.setBookingId(String.valueOf(saved.getId()));
		dto.setRiderId(saved.getRiderId());
		dto.setPickup(saved.getPickup());
		dto.setDropLocation(saved.getDropLocation());
		
		kafkaTemplate.send(AppConstant.TOPIC_UBER_REQUESTS, dto);
		
		return saved;
	}

	@Override
	public void handleBookingResponse(BookingResponseDTO response) {
		
		rideBookingRepo.findById(response.getRiderBookingId()).ifPresent(b -> {
	        b.setBookingId(response.getBookingId());
//	        b.setPrice(response.getPrice());
	        b.setStatus(response.getStatus());
	        rideBookingRepo.save(b);
	    });    

	}

}
