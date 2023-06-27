package com.nv.foodapp.dto;

public class ItemRequestDTO {


	private String itemName;
	private String category;
	private int cost;
	private String imageName;
	public ItemRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemRequestDTO(String itemName, String category, int cost, String imageName) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cost = cost;
		this.imageName = imageName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
