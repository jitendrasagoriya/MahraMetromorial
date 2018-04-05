package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Gender {
	
	FEMALE(0,"FEMALE"),
	MALE(1,"MALE");
	
	
	private static final Map<Integer, Gender> byId = new HashMap<>();
	private static final Map<String, Gender> byValue = new HashMap<>();
	
	
	static {
	     for (Gender e : Gender.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Gender getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Gender getByValue(String value) {
		    return byValue.get(value);
	}
	
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private Gender(int id, String value) {
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
