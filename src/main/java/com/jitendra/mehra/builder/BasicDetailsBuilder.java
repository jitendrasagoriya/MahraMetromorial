package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.BasicDetailDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Gender;

public class BasicDetailsBuilder {
	
	private BasicDetailDto basicDetailDto;

	/**
	 * 
	 */
	public BasicDetailsBuilder() {
		basicDetailDto = new BasicDetailDto();
	}
	
	
	public BasicDetailsBuilder(Profile profile ) {
		basicDetailDto = new BasicDetailDto();
		basicDetailDto.setBodyType(profile.getPerson().getBodyType());
		basicDetailDto.setComplexion(profile.getPerson().getComplexion());
		basicDetailDto.setGender(profile.getPerson().getGender());
		basicDetailDto.setHeight( Integer.parseInt( profile.getPerson().getHeight()));
		basicDetailDto.setManagedBy( "SELF");		
		basicDetailDto.setShowName(Boolean.FALSE);
		basicDetailDto.setWeight(  profile.getPerson().getWeight());		 
	}
	
	public BasicDetailsBuilder withBodyType(BodyType bodyType) {
		this.basicDetailDto.setBodyType(bodyType);
		return this;
	}
	
	public BasicDetailsBuilder withComplexion(Complexion complexion) {
		this.basicDetailDto.setComplexion(complexion);
		return this;
	}
	public BasicDetailsBuilder withGender(Gender gender) {
		this.basicDetailDto.setGender(gender);
		return this;
	}
	public BasicDetailsBuilder withHeight(Integer height) {
		this.basicDetailDto.setHeight(height);
		return this;
	}
	public BasicDetailsBuilder withManagedBy(String managedBy) {
		this.basicDetailDto.setManagedBy(managedBy);
		return this;
	}
	public BasicDetailsBuilder withShowName(Boolean showName) {
		this.basicDetailDto.setShowName(showName);
		return this;
	}
	public BasicDetailsBuilder withWeight(Integer weight) {
		this.basicDetailDto.setWeight(weight);
		return this;
	}
	
	public BasicDetailDto build() {
		return this.basicDetailDto;
	}
	

}
