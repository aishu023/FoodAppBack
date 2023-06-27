package com.nv.foodapp.dto;

public class ItemDefaultDTO {
	private int itemId;
	private String itemName;
	private String category;
	private String imageName;
	public ItemDefaultDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDefaultDTO(int itemId, String itemName, String category, String imageName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.imageName = imageName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	

}
