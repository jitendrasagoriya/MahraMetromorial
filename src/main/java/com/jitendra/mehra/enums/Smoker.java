package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Smoker {
	
	NA(0,"NA"),
	NO(1,"No"),
	YES(2,"Yes"),
	OCCASIONALLY(4,"Occasionally");
	
	private int id;
	
	private String value;
	
	
	private static final Map<Integer, Smoker> byId = new HashMap<>();
	private static final Map<String, Smoker> byValue = new HashMap<>();
	
	
	static {
	     for (Smoker e : Smoker.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue() , e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Smoker getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Smoker getByValue(String value) {
		    return byValue.get(value);
	}

	/**
	 * @param id
	 * @param value
	 */
	private Smoker(int id, String value) {
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
