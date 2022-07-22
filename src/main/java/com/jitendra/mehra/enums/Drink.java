package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Drink {
	
	NA(0,"NA","NA"),
	NO(1,"NO","No"),
	YES(2,"YES","Yes"),
	OCCASIONALLY(3,"OCCASIONALLY","occasionally");
	
	private int id;
	
	private String value;
	
	private String desc;

	
	private static final Map<Integer, Drink> byId = new HashMap<>();
	private static final Map<String, Drink> byValue = new HashMap<>();
	
	
	static {
	     for (Drink e : Drink.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue() , e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Drink getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Drink getByValue(String value) {
		    return byValue.get(value);
	}

	/**
	 * @param id
	 * @param value
	 */
	private Drink(int id, String value,String desc) {
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
