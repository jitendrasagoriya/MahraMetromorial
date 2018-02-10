package com.jitendra.mehra.enums;

public enum Complexion {

	VERYFAIR(0,"VERYFAIR"),
	FAIR(1,"FAIR"),
	WHEATISH(2,"WHEATISH"),
	WHEATISH_BROWN(3,"WHEATISH BROWN"),
	DARK(4,"DARK");
	
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private Complexion(int id, String value) {
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
