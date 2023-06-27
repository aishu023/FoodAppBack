package com.nv.foodapp.dto;

public class UserDTO {
private int userId;
private String firstName;
private String lastName;
private long phoneNumber;
private String emailId;
private String userRole;




public UserDTO(int userId, String firstName, String lastName, long phoneNumber, String emailId, String userRole) {
	// TODO Auto-generated constructor stub
	
	this.userId = userId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.emailId = emailId;
	this.userRole = userRole;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
} 
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getUserRole() {
	return userRole;
}

public void setUserRole(String userRole) {
	this.userRole = userRole;
}



}
