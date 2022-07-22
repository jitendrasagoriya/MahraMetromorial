package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.UserRoles;

@Service
public interface UserRolesService {	 

	public UserRoles insert(UserRoles UserRoles);
	
	public List<UserRoles> getByUseRoles(String role);
	
	public List<UserRoles> getRoleByUserName(String username);
}
