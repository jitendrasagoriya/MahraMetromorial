package com.jitendra.mehra.builder;

import java.sql.Date;

import com.jitendra.mehra.dto.PersonalDetail;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Occupation;

public class PersonalDetailBuilder {
	private PersonalDetail personalDetail;

	/**
	 * @param personalDetail
	 */
	public PersonalDetailBuilder(Profile profile) {
		personalDetail = new PersonalDetail();
		personalDetail.setDob(profile.getPerson().getDob());		
		//personalDetail.setEyeColor(profile.getPerson().set);
		personalDetail.setMaritalStatus(profile.getPerson().getMaritalStatus());
		personalDetail.setOccupation(profile.getPerson().getOccupation());		 
	} 
	
	public PersonalDetailBuilder setMaritalStatus(MaritalStatus maritalStatus) {
		this.setMaritalStatus(maritalStatus);
		return this;
	}
	public PersonalDetailBuilder setDob(Date dob) {
		this.setDob( dob );
		return this;
	}
	public PersonalDetailBuilder setOccupation(Occupation occupation) {
		this.setOccupation(occupation);
		return this;
	}
	public PersonalDetailBuilder setEyeColor(String stirng) {
		this.setEyeColor(stirng	);
		return this;
	}
		
	public PersonalDetail build() {
		return this.personalDetail;
	}
	
	
}
