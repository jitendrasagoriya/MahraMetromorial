package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Relation {

	FATHER(0,"FATHER"),
	MOTHER(1,"MOTHER"),
	BORTHER(2,"BORTHER"),
	SISTER(3,"SISTER");
	 

	private static final Map<Integer, Relation> byId = new HashMap<>();
	private static final Map<String, Relation> byValue = new HashMap<>();
	
	
	static {
	     for (Relation e : Relation.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Relation getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Relation getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	
	private String value;


	/**
	 * @param id
	 * @param value
	 */
	private Relation(int id, String value) {
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
