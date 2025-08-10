package com.wipro.ride.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ride.entity.Ride;

@Repository
public interface RideRepo extends JpaRepository<Ride, Integer> {

}
