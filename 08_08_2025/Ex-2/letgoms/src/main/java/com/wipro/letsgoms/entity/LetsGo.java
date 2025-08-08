package com.wipro.letsgoms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vechicle_movement")
public class LetsGo {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	   Long id;
	  
	   @Column(name = "vechile_id")
	   Long vechileId;
	   
	   @Column(name = "latitude")
	   Double latitude;
	    
	   @Column(name = "longitude") 
	   Double longitude;

	   public Long getId() {
		   return id;
	   }

	   public void setId(Long id) {
		   this.id = id;
	   }

	   public Long getVechileId() {
		   return vechileId;
	   }

	   public void setVechileId(Long vechileId) {
		   this.vechileId = vechileId;
	   }

	   public Double getLatitude() {
		   return latitude;
	   }

	   public void setLatitude(Double latitude) {
		   this.latitude = latitude;
	   }

	   public Double getLongitude() {
		   return longitude;
	   }

	   public void setLongitude(Double longitude) {
		   this.longitude = longitude;
	   }
	   
	   
  
}
