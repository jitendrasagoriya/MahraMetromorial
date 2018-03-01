package com.jitendra.mehra.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.domin.UserAlreadyExistsException;
import com.jitendra.mehra.domin.UserRoles;

@Service
public interface UserService {
	
	public User register(User user) throws UserAlreadyExistsException ;	
	public User register(User user,UserRoles userRoles) throws UserAlreadyExistsException;	
	public User getByUserName(String userName);
	public Page<User> get(Pageable pageable);
	public void delete(String userName);
	public User update(User user);
}
