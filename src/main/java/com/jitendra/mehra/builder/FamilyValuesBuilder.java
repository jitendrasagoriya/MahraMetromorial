package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.FamilyValuesDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.FamilyStatus;
import com.jitendra.mehra.enums.FamilyType;
import com.jitendra.mehra.enums.FamilyValues;

public class FamilyValuesBuilder {
	
	private FamilyValuesDto familyValues;

	 
	public FamilyValuesBuilder() {
		familyValues = new FamilyValuesDto();
	}
	
	public FamilyValuesBuilder(Profile profile) {
		familyValues = new FamilyValuesDto();
		familyValues.setFamilyStatus(profile.getPerson().getFamilyStatus());
		familyValues.setFamilyType(profile.getPerson().getFamilyType());
		familyValues.setFamilyValue(profile.getPerson().getFamilyValues());
		familyValues.setLivingWithParants( profile.getPerson().getLivingWithParant());
		 
	}
	
	public FamilyValuesBuilder(Person  person) {
		familyValues = new FamilyValuesDto();
		familyValues.setFamilyStatus(person.getFamilyStatus());
		familyValues.setFamilyType(person.getFamilyType());
		familyValues.setFamilyValue(person.getFamilyValues());
		familyValues.setLivingWithParants( person.getLivingWithParant());
		 
	}
	
	public FamilyValuesBuilder withLivingWithParants(Boolean obj) {
		this.familyValues.setLivingWithParants(obj);
		return this;
	}
	
	public FamilyValuesBuilder withFamilyValue(FamilyValues obj) {
		this.familyValues.setFamilyValue(obj);
		return this;
	}
	
	public FamilyValuesBuilder withFamilyType(FamilyType obj) {
		this.familyValues.setFamilyType(obj);
		return this;
	}
	
	public FamilyValuesBuilder withFamilyStatus(FamilyStatus obj) {
		this.familyValues.setFamilyStatus(obj);
		return this;
	}
	
	public FamilyValuesDto build() {
		return this.familyValues;
	}

}
