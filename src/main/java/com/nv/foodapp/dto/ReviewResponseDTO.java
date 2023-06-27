package com.nv.foodapp.dto;

import lombok.Data;


public class ReviewResponseDTO {
	
	public String customerName;
	public int StarRating;
	public String message;
	public ReviewResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewResponseDTO(String customerName, int starRating, String message) {
		super();
		this.customerName = customerName;
		StarRating = starRating;
		this.message = message;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getStarRating() {
		return StarRating;
	}
	public void setStarRating(int starRating) {
		StarRating = starRating;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
