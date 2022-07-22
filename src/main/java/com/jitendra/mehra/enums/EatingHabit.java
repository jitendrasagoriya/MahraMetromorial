package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum EatingHabit {
	
	NA(0,"NA","Dont want to disclose"),
	VEGETARIAN(1,"VEGETARIAN","Vegetarion"),
	NONVEGETARIAN(2,"NONVEGETARIAN","Non-Vegetarion"),
	JAIN(3,"JAIN","Jain"),
	EGGETARIAN(5,"EGGETARIAN","Eggetarian");
	
	private int id;
	
	private String value;
	
	private String desc;
	
	
	private static final Map<Integer, EatingHabit> byId = new HashMap<Integer, EatingHabit>();
	private static final Map<String, EatingHabit> byValue = new HashMap<String, EatingHabit>();
	 
	
	static {
		  
	     for (EatingHabit e : EatingHabit.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	public static EatingHabit getById(int id) {
	    return byId.get(id);
	 }
	 
	public static EatingHabit getByValue(String value) {
		    return byValue.get(value);
	}
	

	/**
	 * @param id
	 * @param value
	 * @param desc
	 */
	private EatingHabit(int id, String value, String desc) {
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
