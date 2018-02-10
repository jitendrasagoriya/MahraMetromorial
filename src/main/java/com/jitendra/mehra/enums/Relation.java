package com.jitendra.mehra.enums;

public enum Relation {

	FATHER(0,"FATHER"),
	MOTHER(1,"MOTHER"),
	BORTHER(2,"BORTHER"),
	SISTER(3,"SISTER");
	
	private int id;
	
	
	private String value;


	/**
	 * @param id
	 * @param value
	 */
	private Relation(int id, String value) {
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
