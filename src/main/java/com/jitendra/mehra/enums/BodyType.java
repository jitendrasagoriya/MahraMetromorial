package com.jitendra.mehra.enums;

public enum BodyType {

	
	SLIM(0,"SLIM"),
	AVERAGE(1,"AVERAGE"),
	ATHLETIC(2,"ATHLETIC"),
	HEAVY(3,"HEAVY");
	
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private BodyType(int id, String value) {
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
	};
	
	
}
