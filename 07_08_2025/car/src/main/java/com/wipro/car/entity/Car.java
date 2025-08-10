package com.wipro.car.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "make")
	String make;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "registration_id", referencedColumnName = "id")
	CarRegistrationDetails carRegistrationDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public CarRegistrationDetails getCarRegistrationDetails() {
		return carRegistrationDetails;
	}

	public void setCarRegistrationDetails(CarRegistrationDetails carRegistrationDetails) {
		this.carRegistrationDetails = carRegistrationDetails;
	}
	
	
}
