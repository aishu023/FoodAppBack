package com.nv.foodapp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class InvalidInputDataException extends Exception {

	String fieldName;
	String msg;
	@Override
	public String toString() {
		return fieldName+" "+msg;
	}
	public InvalidInputDataException(String message, String string) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
  
}
