package com.jitendra.mehra.dto;

import com.jitendra.mehra.enums.Occupation;

public class CareerDetailDto {

	private Occupation occupation;
	private String designation ;
	private float income;
	private int experience;
	/**
	 * @return the occupation
	 */
	public Occupation getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the income
	 */
	public float getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(float income) {
		this.income = income;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CareerDetailDto [occupation=" + occupation + ", designation=" + designation + ", income=" + income
				+ ", experience=" + experience + "]";
	}
	
	
}
