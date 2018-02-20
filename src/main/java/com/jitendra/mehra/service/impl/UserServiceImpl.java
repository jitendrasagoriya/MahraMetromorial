package com.jitendra.mehra.service.impl;

import java.util.Arrays;

import org.h2.jdbc.JdbcSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.domin.UserAlreadyExistsException;
import com.jitendra.mehra.domin.UserRoles;
import com.jitendra.mehra.endpoint.PersonEndpoint;
import com.jitendra.mehra.repository.UserRepository;
import com.jitendra.mehra.repository.UserRolesRepository;
import com.jitendra.mehra.service.UserRolesService;
import com.jitendra.mehra.service.UserService;


@Service
public class UserServiceImpl implements UserService,UserRolesService   {
	
	private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserRolesRepository userRolesRepository;
	 

	@Override
	public User register(User user) {			 	 
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User register(User user, UserRoles userRoles) throws UserAlreadyExistsException, JdbcSQLException {
		User registerUser = null;
		
		try {
			
			    registerUser = userRepository.saveAndFlush(user);
				UserRoles userRoles2;
				if(userRoles == null) {
					userRoles2 = new UserRoles();
					userRoles2.setRole("ROLE_NEW");
					userRoles2.setUserName(user.getUsername());
				}else {
					userRoles2 = userRoles;
				}
				
				userRoles2 = insert(userRoles2);
				registerUser.setUserRoles( Arrays.asList(userRoles2));
				
		}catch(Exception exception) {
			logger.info("User Exception{ }",  exception.getMessage() );
			if(exception.getMessage().contains("UNI_USERNAME_ROLE_INDEX_C")) {
				throw new UserAlreadyExistsException("User already register");
			}
		}
		return registerUser;
	}

	@Override
	public UserRoles insert(UserRoles UserRoles) {		 
		return userRolesRepository.saveAndFlush(UserRoles);
	}

	@Override
	public User getByUserName(String userName) {		 
		return userRepository.findOne(userName);
	}

	@Override
	public Page<User> get(Pageable pageable) {
		 return userRepository.findAll(pageable);
	}

	@Override
	public void delete(String userName) {
		userRepository.delete(userName);
	}

	@Override
	public User update(User user) {
		return userRepository.saveAndFlush(user);
	}

	 

}
