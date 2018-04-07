package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.BasicDetailDto;
import com.jitendra.mehra.dto.CollageDetailsDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.Qualification;

public class CollageDetailsBuilder {
	
	private CollageDetailsDto collageDetails;

	/**
	 * 
	 */
	public CollageDetailsBuilder() {
		collageDetails = new CollageDetailsDto();
	}
	
	public CollageDetailsBuilder(Profile profile) {
		collageDetails = new CollageDetailsDto();
		collageDetails.setHighestEducation(profile.getPerson().getQualification());
		collageDetails.setSchoolCollegeName(profile.getPerson().getNameOfCollage());
		collageDetails.setSubject(profile.getPerson().getSubject());
		collageDetails.setUniversity(profile.getPerson().getUniversity());		 
	}
	
	public CollageDetailsBuilder(Person person) {
		collageDetails = new CollageDetailsDto();
		collageDetails.setHighestEducation(person.getQualification());
		collageDetails.setSchoolCollegeName(person.getNameOfCollage());
		collageDetails.setSubject(person.getSubject());
		collageDetails.setUniversity(person.getUniversity());		 
	}
	
	public CollageDetailsBuilder withHighestEducation(Qualification qualification) {
		this.collageDetails.setHighestEducation(qualification);
		return this;
	}
	
	public CollageDetailsBuilder withSchoolCollegeName(String schoolCollegeName) {
		this.collageDetails.setSchoolCollegeName(schoolCollegeName);
		return this;
	}
	
	public CollageDetailsBuilder withSubject(String subject) {
		this.collageDetails.setSubject(subject);
		return this;
	}
	
	public CollageDetailsBuilder withUniversity(String university) {
		this.collageDetails.setUniversity(university);
		return this;
	}
	
	public CollageDetailsDto build() {
		return this.collageDetails;
	}

}
