package com.jitendra.mehra.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.domin.UserRoles;
import com.jitendra.mehra.repository.UserRepository;
import com.jitendra.mehra.repository.UserRolesRepository;
import com.jitendra.mehra.service.UserRolesService;
import com.jitendra.mehra.service.UserService;


@Service
public class UserServiceImpl implements UserService,UserRolesService   {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRolesRepository userRolesRepository;
	 

	@Override
	public User register(User user) {			 	 
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User register(User user, UserRoles userRoles) {
		User registerUser = userRepository.saveAndFlush(user);
		
		UserRoles userRoles2 = new UserRoles();
		userRoles2.setRole("ROLE_NEW");
		userRoles2.setUserName(user.getUsername());
		
		userRoles2 = insert(userRoles2);
		registerUser.setUserRoles( Arrays.asList(userRoles2));
		return null;
	}

	@Override
	public UserRoles insert(UserRoles UserRoles) {		 
		return userRolesRepository.saveAndFlush(UserRoles);
	}

	@Override
	public User getByUserName(String userName) {		 
		return userRepository.findOne(userName);
	}

	 

}
