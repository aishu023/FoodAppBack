package com.nv.foodapp.dto;

public class RestaurantRequestDTO {
	private String restaurantName;
	private String managerName;
	private String contactNumber;
	private String buildingName;
	private String area;
	private String streetNo;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String imageName;
	public RestaurantRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantRequestDTO(String restaurantName, String managerName, String contactNumber, String buildingName,
			String area, String streetNo, String city, String state, String country, String pincode, String imageName) {
		super();
		this.restaurantName = restaurantName;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
		this.buildingName = buildingName;
		this.area = area;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.imageName = imageName;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
}
