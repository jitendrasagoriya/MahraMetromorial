package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum FamilyType {

	
	JOINTFAMILY(0,"Joint family"),
	NUCLEARFAMILY(1,"Nuclear family"),
	OTHERS(2,"Others"),
	NOTAPPLICABLE(3,"Not Applicable");
	

	private static final Map<Integer, FamilyType> byId = new HashMap<>();
	private static final Map<String, FamilyType> byValue = new HashMap<>();
	
	
	static {
	     for (FamilyType e : FamilyType.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue() , e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static FamilyType getById(int id) {
	    return byId.get(id);
	 }
	 
	public static FamilyType getByValue(String value) {	
		return byValue.get(value);
	}
		   
	
	private Integer id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private FamilyType(Integer id, String value) {
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
