package com.jitendra.mehra.enums;

public enum Qualification {

	X(0,"X","10th"),
	XII(1,"XII","12th"),
	G(2,"G","graducation"),	
	PG(3,"PG","Post graducation");
	
	
	private int id;
	
	private String value;
	
	private String dec;

	/**
	 * @param id
	 * @param value
	 * @param dec
	 */
	private Qualification(int id, String value, String dec) {
		this.id = id;
		this.value = value;
		this.dec = dec;
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

	/**
	 * @return the dec
	 */
	public String getDec() {
		return dec;
	}
	
	
	
	
}
