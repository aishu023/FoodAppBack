package com.nv.foodapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int restaurantId;
	private String restaurantName;
	private String managerName;
	private String contactNumber;
	private String imageName;

	@Embedded
	@Column(nullable = true)
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantid") // has to be one to many
	private List<Item> item=new ArrayList<>();

	

	public Restaurant(String restaurantName, String managerName, String contactNumber, String imageName,
			Address address, List<Item> item) {
		super();
		this.restaurantName = restaurantName;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
		this.imageName = imageName;
		this.address = address;
		this.item = item;
	}

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	

}
