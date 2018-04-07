package com.jitendra.mehra.dto;

import com.jitendra.mehra.domin.FamilyMember;

public class ParantsDto {
	private FamilyMember father;
	private FamilyMember mother;
	/**
	 * @return the father
	 */
	public FamilyMember getFather() {
		return father;
	}
	/**
	 * @param father the father to set
	 */
	public void setFather(FamilyMember father) {
		this.father = father;
	}
	/**
	 * @return the mother
	 */
	public FamilyMember getMother() {
		return mother;
	}
	/**
	 * @param mother the mother to set
	 */
	public void setMother(FamilyMember mother) {
		this.mother = mother;
	}
	/**
	 * 
	 */
	public ParantsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param father
	 * @param mother
	 */
	public ParantsDto(FamilyMember father, FamilyMember mother) {
		super();
		this.father = father;
		this.mother = mother;
	}
	
	
	
}
