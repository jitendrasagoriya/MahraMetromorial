package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Qualification {

	NA(0,"NA","Dont want to disclose"),
	X(1,"X","10th"),
	XII(2,"XII","12th"),
	G(3,"G","graducation"),	
	PG(4,"PG","Post graducation"),
	DEPLOMAG(5,"DEPLOMA","Deploma after graducation"),
	DEPLOMAPG(6,"DEPLOMAPG","Deploma after Post graducation");
	
	
	private static final Map<Integer, Qualification> byId = new HashMap<>();
	private static final Map<String, Qualification> byValue = new HashMap<>();
	
	
	static {
	     for (Qualification e : Qualification.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Qualification getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Qualification getByValue(String value) {
		    return byValue.get(value);
	}
	
	
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
