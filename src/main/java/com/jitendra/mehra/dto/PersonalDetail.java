package com.jitendra.mehra.dto;

import java.sql.Date;

import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Occupation;

public class PersonalDetail {
	private Occupation occupation;
	private MaritalStatus maritalStatus;
	private String habit;
	private String eyeColor;
	private Date dob;
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
	 * @return the maritalStatus
	 */
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the habit
	 */
	public String getHabit() {
		return habit;
	}
	/**
	 * @param habit the habit to set
	 */
	public void setHabit(String habit) {
		this.habit = habit;
	}
	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}
	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonalDetail [occupation=" + occupation + ", maritalStatus=" + maritalStatus + ", habit=" + habit
				+ ", eyeColor=" + eyeColor + ", dob=" + dob + "]";
	}
	
	
	
	
}
