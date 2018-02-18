package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum BodyType {

	
	SLIM(0,"SLIM"),
	AVERAGE(1,"AVERAGE"),
	ATHLETIC(2,"ATHLETIC"),
	HEAVY(3,"HEAVY");
	
	
	private static final Map<Integer, BodyType> byId = new HashMap<Integer, BodyType>();
	private static final Map<String, BodyType> byValue = new HashMap<String, BodyType>();
	 
	
	static {
		  
	     for (BodyType e : BodyType.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static BodyType getById(int id) {
	    return byId.get(id);
	 }
	 
	public static BodyType getByValue(String value) {
		    return byValue.get(value);
	}
	
	 
	
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
