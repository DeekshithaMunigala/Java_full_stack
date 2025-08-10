package com.wipro.car.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.car.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

}
