package com.jitendra.mehra.dto;

import com.jitendra.mehra.enums.ParantsDto;

public class FamilyDto {

	 private String about ;
	 private ParantsDto parants ;
	 private SiblingDto sibling ;
	 private FamilyValuesDto familyValue ;
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the parants
	 */
	public ParantsDto getParants() {
		return parants;
	}
	/**
	 * @param parants the parants to set
	 */
	public void setParants(ParantsDto parants) {
		this.parants = parants;
	}
	/**
	 * @return the sibling
	 */
	public SiblingDto getSibling() {
		return sibling;
	}
	/**
	 * @param sibling the sibling to set
	 */
	public void setSibling(SiblingDto sibling) {
		this.sibling = sibling;
	}
	/**
	 * @return the familyValue
	 */
	public FamilyValuesDto getFamilyValue() {
		return familyValue;
	}
	/**
	 * @param familyValue the familyValue to set
	 */
	public void setFamilyValue(FamilyValuesDto familyValue) {
		this.familyValue = familyValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FamilyDto [about=" + about + ", parants=" + parants + ", sibling=" + sibling + ", familyValue="
				+ familyValue + "]";
	}
	 
	 
}
