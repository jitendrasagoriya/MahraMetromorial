package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.service.ProfileService;

@RequestMapping("/api/auth")
@RestController
public class AuthEndpoint {	 
	
	@Autowired
	private ProfileService profileService;
	
	@PostMapping
	Map<String, Object> getToken(HttpSession session,@AuthenticationPrincipal Principal user ) {
		Map<String, Object> responce = new HashMap<>();
		 
		responce.put("token", session.getId());
		responce.put("username", user.getName());
		session.setAttribute("profile", profileService.get(user.getName()) );
		return responce;
	}
	
	
}
