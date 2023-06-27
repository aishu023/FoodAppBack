package com.nv.foodapp.util;

import org.springframework.stereotype.Component;

import com.nv.foodapp.dto.UserDTO;
import com.nv.foodapp.entity.User;

@Component
public class UserDtoConvertor {
	
	public UserDTO convertTo(User user) {

		return new UserDTO(user.getUserId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber(),
				user.getEmailId(),user.getUserRole());
	}
	

}