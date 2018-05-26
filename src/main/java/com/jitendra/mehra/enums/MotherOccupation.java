package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum MotherOccupation {
	
	HOUSEWIFE(0,"HOUSEWIFE","Housewife"),
	BUSSINESS(1,"BUSSINESS","Business/Entrepreneur"),
	PRIVATE(2,"PRIVATE","Service-Private"),
	GOVERNAMENT(3,"GOVERNAMENT","Service-Govt/PSU"),
	ARMY(4,"ARMY","Army/Armed forces"),
	CIVIL(5,"CIVIL","Civil Services"),
	TEACHER(6,"TEACHER","Teacher"),
	RETIRED(7,"RETIRED","Retired"),
	EXPIRED(8,"EXPIRED","expired"),
	FARMER(9,"FARMER","Farmer"),
	NOTEMPLOYED(10,"NOTEMPLOYED","Not Employed"),
	OTHERS(11,"OTHERS","others");
	
	private int id;
	
	private String value;
	
	private String desc;
	
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
	private MotherOccupation(int id, String value,String desc) {
		this.id = id;
		this.value = value;
		this.desc = desc;
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
