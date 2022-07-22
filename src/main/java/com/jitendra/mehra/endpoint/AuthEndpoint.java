package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.UserRoles;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.service.ProfileService;
import com.jitendra.mehra.service.impl.UserServiceImpl;

@RequestMapping("/api/auth")
@RestController
public class AuthEndpoint {	 
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping
	Map<String, Object> getToken(HttpSession session,@AuthenticationPrincipal Principal user ) {
		Map<String, Object> responce = new HashMap<>();
		Profile profile = null;
		
		List<UserRoles> userRoles =   userService.getRoleByUserName(user.getName());
		if(userRoles.size() == 1) {
			if(userRoles.get(0).getRole().equals("ROLE_NEW")) {
				responce.put("type", "NEW" );
			}
		}else {
			profile = profileService.get(user.getName());
			responce.put("picUrl", profile.getPerson().getProfilePic() );
			responce.put("id", profile.getPerson().getId() );
		}
		responce.put("token", session.getId());
		responce.put("username", user.getName());		 
		
		session.setAttribute("profile", profile );
		return responce;
	}
	
	
}
