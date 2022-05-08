package com.praveen.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.praveen.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
}
