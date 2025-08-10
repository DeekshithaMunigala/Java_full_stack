package com.wipro.ride.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ride.entity.RideBooking;

@Repository
public interface RideBookingRepo extends JpaRepository<RideBooking, Long> {

}
