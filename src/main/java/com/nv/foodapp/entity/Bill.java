package com.nv.foodapp.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billId;
	private int itemCount;
	private int grossBillAmount;
	private int gstAmount;


	public Bill(int itemCount, int grossBillAmount, int gstAmount) {
		super();
		this.itemCount = itemCount;
		this.grossBillAmount = grossBillAmount;
		this.gstAmount = gstAmount;
	}


	public Bill() {
		super();
		// TODO Auto-generated constructor stub
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


	public int getGrossBillAmount() {
		return grossBillAmount;
	}


	public void setGrossBillAmount(int grossBillAmount) {
		this.grossBillAmount = grossBillAmount;
	}


	public int getGstAmount() {
		return gstAmount;
	}


	public void setGstAmount(int gstAmount) {
		this.gstAmount = gstAmount;
	}

	

	
	
	
	
}
