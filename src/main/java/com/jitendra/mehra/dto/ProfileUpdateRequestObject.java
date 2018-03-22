package com.jitendra.mehra.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class ProfileUpdateRequestObject {
	
	@JsonView(View.Summary.class)
	private String propertyName;
	
	@JsonView(View.Summary.class)
	private String propertyValue;
	
	@JsonView(View.Summary.class)
	private Long id;
	
	

	/**
	 * 
	 */
	public ProfileUpdateRequestObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param propertyName
	 * @param propertyValue
	 */
	public ProfileUpdateRequestObject(String propertyName, String propertyValue) {
		super();
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
	}

	/**
	 * @return the propertyName
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * @param propertyName the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * @return the propertyValue
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * @param propertyValue the propertyValue to set
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
