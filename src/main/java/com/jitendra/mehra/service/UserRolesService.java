package com.jitendra.mehra.service;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.UserRoles;

@Service
public interface UserRolesService {	 

	public UserRoles insert(UserRoles UserRoles);
}
