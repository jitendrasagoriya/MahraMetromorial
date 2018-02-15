package com.jitendra.mehra.enums;

public enum PersonStatus {
	
	ACTIVE(0,"ACTIVE"),
	HIDE(1,"HIDE"),
	DELETE(2,"DELETE");
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private PersonStatus(int id, String value) {
		this.id = id;
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	

}
