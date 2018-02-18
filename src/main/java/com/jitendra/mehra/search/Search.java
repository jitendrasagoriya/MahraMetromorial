package com.jitendra.mehra.search;

import java.util.List;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Gender;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Qualification;

public class Search {
	private Age age;
	private List<Qualification> qualifications;
	private String gotra;
	private Income income;
	private String city;
	private List<BodyType> bodyTypes;
	private List<Complexion> complexions;
	private Height height;
	private Gender gender;
	private List<MaritalStatus> maritalStatus;
	  
	/**
	 * @return the age
	 */
	public Age getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Age age) {
		this.age = age;
	}
	/**
	 * @return the qualifications
	 */
	public List<Qualification> getQualifications() {
		return qualifications;
	}
	/**
	 * @param qualifications the qualifications to set
	 */
	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	/**
	 * @return the gotra
	 */
	public String getGotra() {
		return gotra;
	}
	/**
	 * @param gotra the gotra to set
	 */
	public void setGotra(String gotra) {
		this.gotra = gotra;
	}
	/**
	 * @return the income
	 */
	public Income getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(Income income) {
		this.income = income;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the bodyTypes
	 */
	public List<BodyType> getBodyTypes() {
		return bodyTypes;
	}
	/**
	 * @param bodyTypes the bodyTypes to set
	 */
	public void setBodyTypes(List<BodyType> bodyTypes) {
		this.bodyTypes = bodyTypes;
	}
	/**
	 * @return the complexions
	 */
	public List<Complexion> getComplexions() {
		return complexions;
	}
	/**
	 * @param complexions the complexions to set
	 */
	public void setComplexions(List<Complexion> complexions) {
		this.complexions = complexions;
	}
	
	/**
	 * @return the height
	 */
	public Height getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Height height) {
		this.height = height;
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
	/**
	 * @return the maritalStatus
	 */
	public List<MaritalStatus> getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(List<MaritalStatus> maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Search [age=" + age + ", qualifications=" + qualifications + ", gotra=" + gotra + ", income=" + income
				+ ", city=" + city + ", bodyTypes=" + bodyTypes + ", complexions=" + complexions + ", height=" + height
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";
	}
	
	
	
	
	
}

 
