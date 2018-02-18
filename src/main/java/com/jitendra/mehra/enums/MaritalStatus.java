package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum MaritalStatus {
	
	NEVERMARRIED(0,"NEVERMARRIED","Never Married"),
	AWAITINGDIVORCE(1,"AWAITINGDIVORCE","Awaiting Divorce"),
	DIVORCED(2,"DIVORCED","Divorced"),
	WINDOWED(3,"WINDOWED","Windowed"),
	ANNULLED(4,"ANNULLED","Annulled");
	
	
	private static final Map<Integer, MaritalStatus> byId = new HashMap<Integer, MaritalStatus>();
	private static final Map<String, MaritalStatus> byValue = new HashMap<String, MaritalStatus>();
	
	
	static {
	     for (MaritalStatus e : MaritalStatus.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static MaritalStatus getById(int id) {
	    return byId.get(id);
	 }
	 
	public static MaritalStatus getByValue(String value) {
		    return byValue.get(value);
	}
	 
	private int id;
	
	private String value;
	
	private String desc;

	/**
	 * @param id
	 * @param value
	 * @param desc
	 */
	private MaritalStatus(int id, String value, String desc) {
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

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	
	

}
