package com.wipro.car.service;

import java.util.List;

import com.wipro.car.entity.Car;

public interface CarService {
		
	void saveCar(Car car);
	List<Car> findAllCars();
	Car updateCar(Long id, Car car);
	Car findCarbyId(Long id);
	void deleteCarById(Long id);
}
