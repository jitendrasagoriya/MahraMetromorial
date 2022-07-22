package com.jitendra.mehra.endpoint;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.service.ProfileService;
import com.jitendra.mehra.utils.ProfileReflactionUtility;

public class ProfileDetailsBase {
	

	private final Logger logger = LoggerFactory.getLogger(ProfileDetailsBase.class);	
 
	@Autowired
	public ProfileService profileService;
	
	ProfileReflactionUtility utility = new ProfileReflactionUtility();
	
	public Profile updateProfileBase( Principal user ,
			 MultiPropertyRequest requestObjects , HttpSession session) {
		
		
		Profile profile = null;
		profile = profileService.get(user.getName());	
		for (ProfileUpdateRequestObject profileUpdateRequestObject : requestObjects.getProperites()) {
			
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
		
		return profileService.save(profile);
		
	}
	

}
