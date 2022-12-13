package com.tpi.crud.service.api;

import com.tpi.crud.dto.UserRegistrationDto;
import com.tpi.crud.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;



public interface UserServiceAPI extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
