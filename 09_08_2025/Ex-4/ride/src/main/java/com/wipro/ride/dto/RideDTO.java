package com.wipro.ride.dto;

public class RideDTO {
	
	String fromLocation;
	String toLocation;
	Double distanceKm;
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
	@Override
	public String toString() {
		return "RideDTO [fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", distanceKm=" + distanceKm
				+ "]";
	}
	
	
	

}
