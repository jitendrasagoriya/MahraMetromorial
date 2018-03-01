package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum MotherOccupation {
	
	HOUSEWIFE(0,"Housewife"),
	BUSSINESS(1,"Business/Entrepreneur"),
	PRIVATE(2,"Service-Private"),
	GOVERNAMENT(3,"Service-Govt/PSU"),
	ARMY(4,"Army/Armed forces"),
	CIVIL(5,"Civil Services"),
	TEACHER(6,"Teacher"),
	RETIRED(7,"Retired"),
	EXPIRED(8,"expired");
	
	private int id;
	
	private String value;
	
	private static final Map<Integer, MotherOccupation> byId = new HashMap<Integer, MotherOccupation>();
	private static final Map<String, MotherOccupation> byValue = new HashMap<String, MotherOccupation>();
	
	static {
	     for (MotherOccupation e :MotherOccupation.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static MotherOccupation getById(int id) {
	    return byId.get(id);
	 }
	 
	public static MotherOccupation getByValue(String value) {
		    return byValue.get(value);
	}

	/**
	 * @param id
	 * @param value
	 */
	private MotherOccupation(int id, String value) {
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
