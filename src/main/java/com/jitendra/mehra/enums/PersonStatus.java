package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum PersonStatus {
	
	ACTIVE(0,"ACTIVE"),
	HIDE(1,"HIDE"),
	DELETE(2,"DELETE"),
	SUSPAND(3,"SUSPAND");
	
	
	private static final Map<Integer, PersonStatus> byId = new HashMap<>();
	private static final Map<String, PersonStatus> byValue = new HashMap<>();
	
	
	static {
	     for (PersonStatus e : PersonStatus.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static PersonStatus getById(int id) {
	    return byId.get(id);
	 }
	 
	public static PersonStatus getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private PersonStatus(int id, String value) {
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
