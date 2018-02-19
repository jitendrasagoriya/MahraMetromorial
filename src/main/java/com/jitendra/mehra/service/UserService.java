package com.jitendra.mehra.service;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.domin.UserRoles;

@Service
public interface UserService {
	
	public User register(User user);
	
	public User register(User user,UserRoles userRoles);
	
	public User getByUserName(String userName);
}
