package com.wipro.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.car.entity.Car;
import com.wipro.car.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping
	public void saveCar(@RequestBody Car car) {
		carService.saveCar(car);
	}
	
	@GetMapping
	public List<Car> findAllCars(){
		return carService.findAllCars();
	}
	
	@GetMapping("/{id}")
	public Car findCarById(@PathVariable Long id) {
		return carService.findCarbyId(id);
	}
	
	@PutMapping("/{id}")
	public Car updateCar(@PathVariable Long id,@RequestBody Car car) {
		return carService.updateCar(id, car);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCarById(@PathVariable Long id) {
		carService.deleteCarById(id);
	}
	
	
}
