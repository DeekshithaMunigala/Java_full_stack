package com.wipro.ride.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ride")
public class Ride {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "from_location")
	String fromLocation;
	
	@Column(name = "to_location")
	String toLocation;
	
	@Column(name = "distance_km")
	Double distanceKm;
	
	@Column(name = "booking_time")
	LocalDateTime bookingTime;
	
	@Column(name = "status")
	String status;
	
	@Column(name = "uber_id")
	String uberId;
	
	@Column(name = "amount")
	Double amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Double getDistanceKm() {
		return distanceKm;
	}

	public void setDistanceKm(Double distanceKm) {
		this.distanceKm = distanceKm;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUberId() {
		return uberId;
	}

	public void setUberId(String uberId) {
		this.uberId = uberId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ride [id=" + id + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", distanceKm="
				+ distanceKm + ", bookingTime=" + bookingTime + ", status=" + status + ", uberId=" + uberId
				+ ", amount=" + amount + "]";
	}

	
	
	
	
}
