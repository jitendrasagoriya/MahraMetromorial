package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.CollageDetailsDto;
import com.jitendra.mehra.dto.EducationDto;
import com.jitendra.mehra.dto.Profile;

public class EducationBuilder {
	
	private EducationDto education;

	 
	public EducationBuilder() {
		education = new EducationDto();
		education.setCollageDetail(new CollageDetailsBuilder().build());
	}

	public EducationBuilder(Profile profile) {
		education = new EducationDto();
		education.setAboutEducation(profile.getPerson().getAboutMe());
		education.setCollageDetail(new CollageDetailsBuilder(profile).build());
	}
	
	public EducationBuilder withAboutEducation(String aboutEducation) {
		this.education.setAboutEducation(aboutEducation) ;
		return this;
	}
	
	public EducationBuilder withCollageDetail(CollageDetailsDto collageDetail) {
		this.education.setCollageDetail(collageDetail) ;
		return this;
	}
	
	public EducationDto build() {
		return this.education;
	}

}
