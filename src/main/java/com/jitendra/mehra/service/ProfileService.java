package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;

 

@Service
public interface ProfileService {
	
	public Profile get(String userName);
	
	public Profile save(Profile profile );	
	
	public Profile update(List<ProfileUpdateRequestObject> updateRequestObjects, String userName );

}
