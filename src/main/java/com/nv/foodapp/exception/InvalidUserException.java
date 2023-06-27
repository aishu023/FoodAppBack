package com.nv.foodapp.exception;

public class InvalidUserException extends Exception {
	
	String fieldName;
	String msg;
	
	
	@Override
	public String toString() {
		return "UserException [fieldName=" + fieldName + ", msg=" + msg + "]";
	}


	public InvalidUserException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InvalidUserException(String fieldName, String msg) {
		super();
		this.fieldName = fieldName;
		this.msg = msg;
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
