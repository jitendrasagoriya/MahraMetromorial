package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum FamilyValues {
	CONCERVATIVE(0,"Concervative"),
	MODERATE(1,"Moderate"),
	ORTHODOX(2,"Orthodox"),
	LIBERAL(3,"Liberal"),
	NOTAPPLICABLE(4,"Not Applicable");
	
	
	
	private static final Map<Integer, FamilyValues> byId = new HashMap<>();
	private static final Map<String, FamilyValues> byValue = new HashMap<>();
	
	
	static {
	     for (FamilyValues e : FamilyValues.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue() , e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static FamilyValues getById(int id) {
	    return byId.get(id);
	 }
	 
	public static FamilyValues getByValue(String value) {	
		return byValue.get(value);
	}
		  
	
	private Integer id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private FamilyValues(Integer id, String value) {
		this.id = id;
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	

}
