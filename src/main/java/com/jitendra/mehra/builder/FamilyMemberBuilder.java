package com.jitendra.mehra.builder;

import java.sql.Date;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.dto.FamilyDto;
import com.jitendra.mehra.dto.FamilyMemberDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.SiblingDto;
import com.jitendra.mehra.enums.Relation;

public class FamilyMemberBuilder {
	
	private FamilyMemberDto familyMember;

	 
	public FamilyMemberBuilder() {
		familyMember = new FamilyMemberDto();
	}

 
	public FamilyMemberBuilder(FamilyMember familyMember) {
		this.familyMember = new FamilyMemberDto();
		
		this.familyMember.setDob(familyMember.getDob());
		this.familyMember.setGotra(familyMember.getGotra());
		this.familyMember.setGotraSave(familyMember.getFamilyGotra());
		this.familyMember.setId(familyMember.getId());
		this.familyMember.setName(familyMember.getName());
		this.familyMember.setOccupation(familyMember.getOccupation().getValue());
		this.familyMember.setPersonId(familyMember.getPersonId());
		this.familyMember.setRelation(familyMember.getRelation());
		this.familyMember.setSalary(Long.parseLong( familyMember.getSalary()));
		this.familyMember.setUserName(familyMember.getUserName());
		   
	}
	
	public FamilyMemberBuilder(Profile profile,Relation relation) {
		this.familyMember = new FamilyMemberDto();		
		for (FamilyMember familyMember : profile.getFamilyMembers()) {
			if(familyMember.getRelation().getValue().equals(relation.getValue())) {				
				this.familyMember.setDob(familyMember.getDob());
				this.familyMember.setGotra(familyMember.getGotra());
				this.familyMember.setGotraSave(familyMember.getFamilyGotra());
				this.familyMember.setId(familyMember.getId());
				this.familyMember.setName(familyMember.getName());
				this.familyMember.setOccupation(familyMember.getOccupation().getValue());
				this.familyMember.setPersonId(familyMember.getPersonId());
				this.familyMember.setRelation(familyMember.getRelation());
				this.familyMember.setSalary(Long.parseLong( familyMember.getSalary()));
				this.familyMember.setUserName(familyMember.getUserName());
				break;
			}
		}		   
	}
	
	public FamilyMemberBuilder withUserName(String obj) {
		this.familyMember.setUserName(obj);
		return this;
	}
	
	public FamilyMemberBuilder withSalary(Long obj) {
		this.familyMember.setSalary(obj);
		return this;
	}
	
	public FamilyMemberBuilder withRelation(Relation obj) {
		this.familyMember.setRelation(obj);
		return this;
	}
	
	public FamilyMemberBuilder withPersonId(Long obj) {
		this.familyMember.setPersonId(obj);
		return this;
	}
	
	
	public FamilyMemberBuilder withOccupation(String obj) {
		this.familyMember.setOccupation(obj);
		return this;
	}
	
	public FamilyMemberBuilder withName(String obj) {
		this.familyMember.setName(obj);
		return this;
	}
	
	public FamilyMemberBuilder withId(Long obj) {
		this.familyMember.setId(obj);
		return this;
	}
	
	public FamilyMemberBuilder withGotraSave(String obj) {
		this.familyMember.setGotraSave(obj);
		return this;
	}
	
	public FamilyMemberBuilder withGotra(String obj) {
		this.familyMember.setGotra(obj);
		return this;
	}
	
	
	public FamilyMemberBuilder withDob(Date obj) {
		this.familyMember.setDob(obj);
		return this;
	}
	
	public FamilyMemberDto build() {
		return this.familyMember;
	}
	

}
