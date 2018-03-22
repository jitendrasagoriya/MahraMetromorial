package com.jitendra.mehra.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.service.FamilyMemberService;
import com.jitendra.mehra.service.PersonService;
import com.jitendra.mehra.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {
	

	@Autowired
	private PersonService personService;
	
	@Autowired
	private FamilyMemberService familyMemberService;

	@Override
	public Profile get(String userName) {
		Profile profile = new Profile();
		Person person = personService.getById(  userName );
		Set<FamilyMember> familyMembers = new HashSet<>( familyMemberService.getByUserName( userName ) );
		profile.setFamilyMembers(familyMembers);
		profile.setPerson(person);
		return profile;
	}

	 

	@Override
	public Profile save(Profile profile) {
		Set<FamilyMember> familyMembers =  profile.getFamilyMembers();
		Person person = personService.update( profile.getPerson() );
		if(familyMembers!=null && !familyMembers.isEmpty()) {
			familyMembers = new HashSet<>( familyMemberService.save(familyMembers) );
			profile.setFamilyMembers(new HashSet<>(familyMembers));
		}
		profile.setPerson(person);
		
		return profile;
	}

}
