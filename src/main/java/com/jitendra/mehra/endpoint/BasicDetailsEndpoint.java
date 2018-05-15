package com.jitendra.mehra.endpoint;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.builder.BasicDetailsBuilder;
import com.jitendra.mehra.dto.BasicDetailDto;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.utils.JSONUtility;
import com.jitendra.mehra.utils.ProfileReflactionUtility;

@Secured("ROLE_USER")
@RestController
@RequestMapping(path="/api/profile/basic")
public class BasicDetailsEndpoint extends ProfileDetailsBase {
	
	private final Logger logger = LoggerFactory.getLogger(BasicDetailsEndpoint.class);
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.PUT) 
	public ResponseEntity<Profile>  updateBasic(@AuthenticationPrincipal Principal user ,
			@RequestBody String profileBase , HttpSession session   ){		
		ProfileReflactionUtility utility = new ProfileReflactionUtility();
		
		logger.info("updateBasic batch : {}" ,user.getName());	
		logger.info("updateBasic JSON String : {}" ,profileBase);	
		logger.info("updateBasic JSON Map : {}" ,JSONUtility.jsonToMap(profileBase));	
		logger.info("updateBasic Convert Into properties {}" , utility.convertMapToProfileUpdateRequestObject(JSONUtility.jsonToMap(profileBase)));
			
		return  new ResponseEntity<Profile>( 
				updateProfileBase(user, 
						new MultiPropertyRequest(
								utility.convertMapToProfileUpdateRequestObject(
										JSONUtility.jsonToMap(profileBase)
										)
								), session
						),HttpStatus.OK 
				);
	} 
	
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<BasicDetailDto>  getBaicsDetails(@AuthenticationPrincipal Principal user, 
			HttpSession session   ){
		
		logger.info("getBaicsDetails : {}" ,user.getName());
		
		Profile profile = null ;
		if(session.getAttribute("profile")!= null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());			
		}	
		
		return  new ResponseEntity<BasicDetailDto>( new BasicDetailsBuilder(profile).build(),HttpStatus.OK ) ;
	}

}
