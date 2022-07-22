package com.jitendra.mehra.dto;

import com.jitendra.mehra.enums.FamilyStatus;
import com.jitendra.mehra.enums.FamilyType;
import com.jitendra.mehra.enums.FamilyValues;

public class FamilyValuesDto {
	
	private FamilyStatus familyStatus;
	private FamilyValues familyValue;
	/**
	 * @return the familyStatus
	 */
	public FamilyStatus getFamilyStatus() {
		return familyStatus;
	}
	/**
	 * @param familyStatus the familyStatus to set
	 */
	public void setFamilyStatus(FamilyStatus familyStatus) {
		this.familyStatus = familyStatus;
	}
	/**
	 * @return the familyValue
	 */
	public FamilyValues getFamilyValue() {
		return familyValue;
	}
	/**
	 * @param familyValue the familyValue to set
	 */
	public void setFamilyValue(FamilyValues familyValue) {
		this.familyValue = familyValue;
	}
	/**
	 * @return the familyType
	 */
	public FamilyType getFamilyType() {
		return familyType;
	}
	/**
	 * @param familyType the familyType to set
	 */
	public void setFamilyType(FamilyType familyType) {
		this.familyType = familyType;
	}
	/**
	 * @return the livingWithParants
	 */
	public Boolean getLivingWithParants() {
		return livingWithParants;
	}
	/**
	 * @param livingWithParants the livingWithParants to set
	 */
	public void setLivingWithParants(Boolean livingWithParants) {
		this.livingWithParants = livingWithParants;
	}
	private FamilyType familyType;
	private Boolean livingWithParants ;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FamilyValuesDto [familyStatus=" + familyStatus + ", familyValue=" + familyValue + ", familyType="
				+ familyType + ", livingWithParants=" + livingWithParants + "]";
	}
	
	

}
