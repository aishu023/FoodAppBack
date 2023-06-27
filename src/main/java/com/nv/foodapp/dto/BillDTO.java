package com.nv.foodapp.dto;

import java.util.List;

import com.nv.foodapp.entity.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BillDTO {

	private int billId;
	private int itemCount;
	private int totalAmount;
	private int gstAmount;
	public BillDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillDTO(int billId, int itemCount, int totalAmount, int gstAmount) {
		super();
		this.billId = billId;
		this.itemCount = itemCount;
		this.totalAmount = totalAmount;
		this.gstAmount = gstAmount;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getGstAmount() {
		return gstAmount;
	}
	public void setGstAmount(int gstAmount) {
		this.gstAmount = gstAmount;
	}
	
	
}   
