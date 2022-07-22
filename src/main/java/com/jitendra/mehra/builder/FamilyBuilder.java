package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.FamilyDto;
import com.jitendra.mehra.dto.FamilyValuesDto;
import com.jitendra.mehra.dto.ParantsDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.SiblingDto;

public class FamilyBuilder {
	
	private FamilyDto family;

	 
	public FamilyBuilder() {
		family = new FamilyDto();
	}
	
	public FamilyBuilder(Profile profile) {
		family = new FamilyDto();
		family.setAbout(profile.getPerson().getAboutFamily());
		family.setFamilyValue(new FamilyValuesBuilder(profile).build());
		family.setParants(new ParantsBuilder(profile).build());
		family.setSibling(new SiblingBuilder(profile).build());
	}
	
	 
	
	public FamilyBuilder withSibling(SiblingDto obj) {
		this.family.setSibling(obj);
		return this;
	}
	
	public FamilyBuilder withParants(ParantsDto obj) {
		this.family.setParants(obj);
		return this;
	}
	
	public FamilyBuilder withFamilyValue(FamilyValuesDto obj) {
		this.family.setFamilyValue(obj);
		return this;
	}
	
	
	public FamilyBuilder withAbout(String obj) {
		this.family.setAbout(obj);
		return this;
	}
	
	public FamilyDto build() {
		return this.family;
	}

}
