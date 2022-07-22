package com.jitendra.mehra.dto;

import java.util.List;


public class MultiPropertyRequest {
	
	 
	List<ProfileUpdateRequestObject> properites;

	/**
	 * @return the properites
	 */
	public List<ProfileUpdateRequestObject> getProperites() {
		return properites;
	}

	/**
	 * @param properites the properites to set
	 */
	public void setProperites(List<ProfileUpdateRequestObject> properites) {
		this.properites = properites;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MultiPropertyRequest [properites=" + properites + "]";
	}

	/**
	 * @param properites
	 */
	public MultiPropertyRequest(List<ProfileUpdateRequestObject> properites) {
		super();
		this.properites = properites;
	}

	/**
	 * 
	 */
	public MultiPropertyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	

}
