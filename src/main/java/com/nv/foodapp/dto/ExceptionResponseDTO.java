package com.nv.foodapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


public class ExceptionResponseDTO {
	
	private String errorMsg;
	private String dateTime;
	public ExceptionResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponseDTO(String errorMsg, String dateTime) {
		super();
		this.errorMsg = errorMsg;
		this.dateTime = dateTime;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	

}
