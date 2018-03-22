package com.jitendra.mehra.dto;

import java.util.List;


public class MultiPropertyRequest {
	
	 
	List<ProfileUpdateRequestObject> list;

	/**
	 * @return the list
	 */
	public List<ProfileUpdateRequestObject> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<ProfileUpdateRequestObject> list) {
		this.list = list;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MultiPropertyRequest [list=" + list + "]";
	}
	
	

}
