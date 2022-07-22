package com.jitendra.mehra.dto;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Gender;

public class BasicDetailDto   {
	
	private int height;
	private String managedBy ;
	private Boolean showName ;
	private Complexion complexion ;
	private BodyType bodyType ;
	private int weight  ;
	private Gender gender ;
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the managedBy
	 */
	public String getManagedBy() {
		return managedBy;
	}
	/**
	 * @param managedBy the managedBy to set
	 */
	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}
	/**
	 * @return the showName
	 */
	public Boolean getShowName() {
		return showName;
	}
	/**
	 * @param showName the showName to set
	 */
	public void setShowName(Boolean showName) {
		this.showName = showName;
	}
	/**
	 * @return the complexion
	 */
	public Complexion getComplexion() {
		return complexion;
	}
	/**
	 * @param complexion the complexion to set
	 */
	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}
	/**
	 * @return the bodyType
	 */
	public BodyType getBodyType() {
		return bodyType;
	}
	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BasicDetailDto [height=" + height + ", managedBy=" + managedBy + ", showName=" + showName
				+ ", complexion=" + complexion + ", bodyType=" + bodyType + ", weight=" + weight + ", gender=" + gender
				+ "]";
	}
	 
	

}
