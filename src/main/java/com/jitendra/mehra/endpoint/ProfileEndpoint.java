package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

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

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.domin.Profile;
import com.jitendra.mehra.service.FamilyMemberService;
import com.jitendra.mehra.service.PersonService;

@RestController
@RequestMapping(path="/api/profile")
public class ProfileEndpoint {
	

	private final Logger logger = LoggerFactory.getLogger(ProfileEndpoint.class);
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private FamilyMemberService familyMemberService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<Profile>  viewProfile(@AuthenticationPrincipal Principal user ){
		logger.info("view : {}" ,user.getName());
		Profile profile = new Profile();
		Person person = personService.getById( user.getName() );
		Set<FamilyMember> familyMembers = new HashSet<>( familyMemberService.getByUserName(user.getName() ) );
		profile.setFamilyMembers(familyMembers);
		profile.setPerson(person);
		return  new ResponseEntity<Profile>( profile,HttpStatus.OK ) ;
	}
	
	 

}
