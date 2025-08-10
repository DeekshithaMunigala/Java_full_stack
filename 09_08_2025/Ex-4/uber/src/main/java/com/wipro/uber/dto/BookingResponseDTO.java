package com.wipro.uber.dto;

public class BookingResponseDTO {
	
	Long riderBookingId;
    String bookingId; 
//    Double price;
    String status;
    
    
	public Long getRiderBookingId() {
		return riderBookingId;
	}
	public void setRiderBookingId(Long riderBookingId) {
		this.riderBookingId = riderBookingId;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
//	public Double getPrice() {
//		return price;
//	}
//	public void setPrice(Double price) {
//		this.price = price;
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "BookingResponseDTO [riderBookingId=" + riderBookingId + ", bookingId=" + bookingId + ", status=" + status + "]";
	}

}
