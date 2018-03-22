package com.jitendra.mehra.service;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.dto.Profile;

 

@Service
public interface ProfileService {
	
	public Profile get(String userName);
	
	public Profile save(Profile profile );

}
