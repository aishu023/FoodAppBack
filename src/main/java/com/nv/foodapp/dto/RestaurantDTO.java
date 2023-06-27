package com.nv.foodapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RestaurantDTO {

	private int restaurantId;
	private String restaurantName;
	private String restaurantContactNumber;
	private String city;
	private String state;
	private String imageName;

	public RestaurantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RestaurantDTO(int restaurantId, String restaurantName, String restaurantContactNumber, String city,
			String state, String imageName) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantContactNumber = restaurantContactNumber;
		this.city = city;
		this.state = state;
		this.imageName = imageName;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantContactNumber() {
		return restaurantContactNumber;
	}

	public void setRestaurantContactNumber(String restaurantContactNumber) {
		this.restaurantContactNumber = restaurantContactNumber;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
