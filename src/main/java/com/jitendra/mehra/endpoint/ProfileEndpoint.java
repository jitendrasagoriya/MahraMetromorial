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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.PersonalDetail;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.service.ProfileService;
import com.jitendra.mehra.utils.ProfileReflactionUtility;

@RestController
@RequestMapping(path="/api/profile")
public class ProfileEndpoint {
	

	private final Logger logger = LoggerFactory.getLogger(ProfileEndpoint.class);	
 
	@Autowired
	private ProfileService profileService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<Profile>  viewProfile(@AuthenticationPrincipal Principal user, HttpSession session ){
		logger.info("view : {}" ,user.getName());
		Profile profile = null ;
		if(session.getAttribute("profile")!= null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());	
		}
		return  new ResponseEntity<Profile>( profile,HttpStatus.OK ) ;
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<Profile>  viewProfile(@AuthenticationPrincipal Principal user, @PathVariable(name="name") String userName ){
		logger.info("view : {}" ,userName);
		Profile profile = profileService.get(userName); 
		return  new ResponseEntity<Profile>( profile,HttpStatus.OK ) ;
	}
	
	
	
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.PUT) 
	public ResponseEntity<Boolean>  updateProfile(@AuthenticationPrincipal Principal user ,
			@RequestBody ProfileUpdateRequestObject requestObject , HttpSession session   ){
		
		ProfileReflactionUtility utility = new ProfileReflactionUtility();
		
		logger.info("update : {}" ,user.getName());
		logger.info("session object : {}" ,session.getAttribute("profile"));
		
		Profile profile = null ;
		if(session.getAttribute("profile")!= null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());			
		
		}		
		
		if(requestObject.getId() != null && requestObject.getId() > 0) {
			logger.info("Family member need to be updated : {}" ,requestObject.getId());
			for (FamilyMember familyMember : profile.getFamilyMembers()) {
				if(familyMember.getId() == requestObject.getId() ) {
					familyMember.setIsEdit(Boolean.TRUE);
				}
			}
			logger.info("Updating family member : {}" ,requestObject.getId());
			logger.info("Updating family member : property name : {} and property value : {}" ,requestObject.getPropertyName(), requestObject.getPropertyValue());
			utility.updateFamilyMemberByRelflaction(profile, requestObject.getPropertyName(), requestObject.getPropertyValue());
		} else {
			logger.info("Updating person : property name : {} and property value : {}" ,requestObject.getPropertyName(), requestObject.getPropertyValue());
			utility.updatePersonByRelflaction(profile, requestObject.getPropertyName(), requestObject.getPropertyValue());
		}		
		session.setAttribute("profile",profile);
		
		return  new ResponseEntity<Boolean>( Boolean.TRUE,HttpStatus.OK ) ;
		 
	}
	 
	
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/update", method = RequestMethod.PUT) 
	public ResponseEntity<Profile>  updateProfile(@AuthenticationPrincipal Principal user ,
			@RequestBody MultiPropertyRequest requestObjects , HttpSession session   ){
		
		ProfileReflactionUtility utility = new ProfileReflactionUtility();
		
		logger.info("updateProfile batch : {}" ,user.getName());	
		logger.info("updateProfile JSON Object : {}" ,requestObjects);	
		
		Profile profile = null ;
		profile = profileService.get(user.getName());	
		for (ProfileUpdateRequestObject profileUpdateRequestObject : requestObjects.getList()) {
			
			if(profileUpdateRequestObject.getId() != null && profileUpdateRequestObject.getId() > 0) {
				
				logger.info("Family member need to be updated : {}" ,profileUpdateRequestObject.getId());
				for (FamilyMember familyMember : profile.getFamilyMembers()) {
					if(familyMember.getId() == profileUpdateRequestObject.getId() ) {
						familyMember.setIsEdit(Boolean.TRUE);
					}
				}
				
				logger.info("Updating family member : {}" ,profileUpdateRequestObject.getId());
				logger.info("Updating family member : property name : {} and property value : {}" ,profileUpdateRequestObject.getPropertyName(), profileUpdateRequestObject.getPropertyValue());
				profile = utility.updateFamilyMemberByRelflaction(profile, profileUpdateRequestObject.getPropertyName(), profileUpdateRequestObject.getPropertyValue());
			
			} else {
				logger.info("Updating person : property name : {} and property value : {}" ,profileUpdateRequestObject.getPropertyName(), profileUpdateRequestObject.getPropertyValue());
				profile = utility.updatePersonByRelflaction(profile, profileUpdateRequestObject.getPropertyName(), profileUpdateRequestObject.getPropertyValue());
			}
			
		}
		
		profileService.save(profile);
		
		return new ResponseEntity<Profile>( profile,HttpStatus.OK );
	}
	

}
