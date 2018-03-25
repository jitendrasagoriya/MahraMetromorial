package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum FamilyStatus {

	RICH(0,"Rich"),
	MIDDLECLASS(1,"Middle Class"),
	UPPERMIDDLECLASS(2,"Upper Middle Class"),
	LOWERMIDDLECLASS(3,"Lower Middle Class"),
	POOR(4,"Poor"),
	NOTAPPLICABLE(5,"Not Applicable");
	
	
	private static final Map<Integer, FamilyStatus> byId = new HashMap<>();
	private static final Map<String, FamilyStatus> byValue = new HashMap<>();
	
	
	static {
	     for (FamilyStatus e : FamilyStatus.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue() , e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static FamilyStatus getById(int id) {
	    return byId.get(id);
	 }
	 
	public static FamilyStatus getByValue(String value) {	
		return byValue.get(value);
	}
		   
	
	private Integer id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private FamilyStatus(Integer id, String value) {
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
