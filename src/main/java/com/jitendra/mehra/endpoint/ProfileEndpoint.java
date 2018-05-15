package com.jitendra.mehra.endpoint;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.utils.ProfileReflactionUtility;

@RestController
@RequestMapping(path = "/api/profile")
public class ProfileEndpoint extends ProfileDetailsBase {

	private final Logger logger = LoggerFactory.getLogger(ProfileEndpoint.class);

	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<Profile> viewProfile(@AuthenticationPrincipal Principal user, HttpSession session) {
		logger.info("view : {}", user.getName());
		Profile profile = null;
		if (session.getAttribute("profile") != null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());
		}
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}

	@Secured("ROLE_USER")
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<Profile> viewProfile(@AuthenticationPrincipal Principal user,
			@PathVariable(name = "name") String userName) {
		logger.info("view : {}", userName);
		Profile profile = profileService.get(userName);
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}

	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> updateProfile(@AuthenticationPrincipal Principal user,
			@RequestBody ProfileUpdateRequestObject requestObject, HttpSession session) {

		ProfileReflactionUtility utility = new ProfileReflactionUtility();

		logger.info("update : {}", user.getName());
		logger.info("session object : {}", session.getAttribute("profile"));

		Profile profile = null;
		if (session.getAttribute("profile") != null) {
			profile = (Profile) session.getAttribute("profile");
		} else {
			profile = profileService.get(user.getName());

		}

		if (requestObject.getId() != null && requestObject.getId() > 0) {
			logger.info("Family member need to be updated : {}", requestObject.getId());
			for (FamilyMember familyMember : profile.getFamilyMembers()) {
				if (familyMember.getId() == requestObject.getId()) {
					familyMember.setIsEdit(Boolean.TRUE);
				}
			}
			logger.info("Updating family member : {}", requestObject.getId());
			logger.info("Updating family member : property name : {} and property value : {}",
					requestObject.getPropertyName(), requestObject.getPropertyValue());
			utility.updateFamilyMemberByRelflaction(profile, requestObject.getPropertyName(),
					requestObject.getPropertyValue());
		} else {
			logger.info("Updating person : property name : {} and property value : {}", requestObject.getPropertyName(),
					requestObject.getPropertyValue());
			utility.updatePersonByRelflaction(profile, requestObject.getPropertyName(),
					requestObject.getPropertyValue());
		}
		profile = profileService.save(profile);
		session.setAttribute("profile", profile);

		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);

	}

	@Secured("ROLE_USER")
	@RequestMapping(path = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Profile> updateProfile(@AuthenticationPrincipal Principal user,
			@RequestBody MultiPropertyRequest requestObjects, HttpSession session) {

		logger.info("updateProfile batch : {}", user.getName());
		logger.info("updateProfile JSON Object : {}", requestObjects);
		return new ResponseEntity<Profile>(super.updateProfileBase(user, requestObjects, session), HttpStatus.OK);
	}

	@Transactional
	@Secured("ROLE_USER")
	@RequestMapping(path = "/updateByProperties", method = RequestMethod.PUT)
	public ResponseEntity<Profile> updates(@AuthenticationPrincipal Principal user,
			@RequestBody MultiPropertyRequest requestObjects, HttpSession session) {

		logger.info("updateProfile batch : {}", user.getName());
		logger.info("updateProfile JSON Object : {}", requestObjects);

		return new ResponseEntity<Profile>(profileService.update(requestObjects.getProperites(), user.getName()),
				HttpStatus.OK);
	}

}
