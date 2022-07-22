package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.dto.ParantsDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.Relation;

public class ParantsBuilder {
	
	private ParantsDto parants;

	 
	public ParantsBuilder() {
		parants = new ParantsDto();
	}
	
	
	public ParantsBuilder(Profile profile) {
		parants = new ParantsDto();		
		for (FamilyMember familyMember : profile.getFamilyMembers()) {
			if(familyMember.getRelation().getValue().equals(Relation.FATHER.getValue())) {
				parants.setFather(familyMember);
			} else if( familyMember.getRelation().getValue().equals(Relation.FATHER.getValue()) ) {
				parants.setMother(familyMember);
			}			
		}		
	}
	
	public ParantsBuilder withFather(FamilyMember obj) {
		this.parants.setFather(obj);
		return this;
	}
	
	public ParantsBuilder withMother(FamilyMember obj) {
		this.parants.setMother(obj);
		return this;
	}
	
	public ParantsDto build() {
		return this.parants;
	}

}
