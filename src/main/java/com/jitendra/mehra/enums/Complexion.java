package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Complexion {

	NA(0,"NA"),
	VERYFAIR(1,"VERYFAIR"),
	FAIR(2,"FAIR"),
	WHEATISH(3,"WHEATISH"),
	WHEATISH_BROWN(4,"WHEATISH BROWN"),
	DARK(5,"DARK");
	
	
	private static final Map<Integer, Complexion> byId = new HashMap<Integer, Complexion>();
	private static final Map<String, Complexion> byValue = new HashMap<String, Complexion>();
	
	
	static {
	     for (Complexion e : Complexion.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Complexion getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Complexion getByValue(String value) {
		    return byValue.get(value);
	}
	
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private Complexion(int id, String value) {
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
