package com.jitendra.mehra.builder;

import java.sql.Date;

import com.jitendra.mehra.dto.PersonalDetailDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Occupation;

public class PersonalDetailBuilder {
	private PersonalDetailDto personalDetail;

	/**
	 * @param personalDetail
	 */
	public PersonalDetailBuilder(Profile profile) {
		personalDetail = new PersonalDetailDto();
		personalDetail.setDob(profile.getPerson().getDob());		
		//personalDetail.setEyeColor(profile.getPerson().set);
		personalDetail.setMaritalStatus(profile.getPerson().getMaritalStatus());
		personalDetail.setOccupation(profile.getPerson().getOccupation());		 
	} 
	
	public PersonalDetailBuilder() {
		personalDetail = new PersonalDetailDto();		 	 
	}
	
	public PersonalDetailBuilder setMaritalStatus(MaritalStatus maritalStatus) {
		this.personalDetail.setMaritalStatus(maritalStatus);
		return this;
	}
	public PersonalDetailBuilder setDob(Date dob) {
		this.personalDetail.setDob( dob );
		return this;
	}
	public PersonalDetailBuilder setOccupation(Occupation occupation) {
		this.personalDetail.setOccupation(occupation);
		return this;
	}
	public PersonalDetailBuilder setEyeColor(String stirng) {
		this.personalDetail.setEyeColor(stirng	);
		return this;
	}
		
	public PersonalDetailDto build() {
		return this.personalDetail;
	}
	
	
}
