package com.wipro.ride.service;

import com.wipro.ride.dto.BookingResponseDTO;
import com.wipro.ride.entity.RideBooking;

public interface RideBookingService {
	
	RideBooking createBooking(RideBooking booking);
	
	void handleBookingResponse(BookingResponseDTO response);
}
