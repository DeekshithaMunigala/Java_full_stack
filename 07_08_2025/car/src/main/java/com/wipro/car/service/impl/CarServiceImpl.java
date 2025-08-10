package com.wipro.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.car.entity.Car;
import com.wipro.car.repo.CarRepo;
import com.wipro.car.service.CarService;


@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepo carRepo;

	@Override
	public void saveCar(Car car) {
		carRepo.save(car);

	}

	@Override
	public List<Car> findAllCars() {
		
		return carRepo.findAll();
	}

	@Override
	public Car updateCar(Long id, Car updateCar) {
		return carRepo.findById(id).map(car -> {
			car.setMake(updateCar.getMake());
			car.setCarRegistrationDetails(updateCar.getCarRegistrationDetails());
			return carRepo.save(car);
		}).orElse(null);
	}

	
	@Override
	public Car findCarbyId(Long id) {
		
		return carRepo.findById(id).orElse(null);
	}
	
	@Override
	public void deleteCarById(Long id) {
		
		carRepo.deleteById(id);;
	}


}
