package com.jitendra.mehra.search;

import java.util.List;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((bodyTypes == null) ? 0 : bodyTypes.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((complexions == null) ? 0 : complexions.hashCode());
		result = prime * result + ((gotra == null) ? 0 : gotra.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((income == null) ? 0 : income.hashCode());
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Search other = (Search) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (bodyTypes == null) {
			if (other.bodyTypes != null)
				return false;
		} else if (!bodyTypes.equals(other.bodyTypes))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (complexions == null) {
			if (other.complexions != null)
				return false;
		} else if (!complexions.equals(other.complexions))
			return false;
		if (gotra == null) {
			if (other.gotra != null)
				return false;
		} else if (!gotra.equals(other.gotra))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (income == null) {
			if (other.income != null)
				return false;
		} else if (!income.equals(other.income))
			return false;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Search [age=" + age + ", qualifications=" + qualifications + ", gotra=" + gotra + ", income=" + income
				+ ", city=" + city + ", bodyTypes=" + bodyTypes + ", complexions=" + complexions + ", height=" + height
				+ "]";
	}
	
	
	
	
	
}

 
