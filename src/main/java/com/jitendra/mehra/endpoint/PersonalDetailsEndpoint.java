package com.jitendra.mehra.endpoint;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.service.ProfileService;

@Secured("ROLE_USER")
@RestController
@RequestMapping(path="/api/profile/personal")
public class PersonalDetailsEndpoint {
	
	private final Logger logger = LoggerFactory.getLogger(PersonalDetailsEndpoint.class);
	
	@Autowired
	private ProfileService profileService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<Profile>  viewPersonal(@AuthenticationPrincipal Principal user, 
			HttpSession session   ){
		
		logger.info("viewPersonal : {}" ,user.getName());
		
		Profile profile = null ;
		if(session.getAttribute("profile")!= null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());			
		}	
		
		return  new ResponseEntity<Profile>( profile,HttpStatus.OK ) ;
	}
	

}
