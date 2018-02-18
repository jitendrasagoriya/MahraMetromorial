package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Challenged {

	NONE(0,"NONE","NONE"),
	PHB(1,"PHB","Physically Handicapped from birth"),
	PHA(2,"PHA","Physically Handicapped due to accident"),
	MCB(3,"MCB","Mentally Challenged from birth"),
	MCA(4,"MCA","Mentally Challenged due to accident");
	
	
	private static final Map<Integer, Challenged> byId = new HashMap<Integer, Challenged>();
	private static final Map<String, Challenged> byValue = new HashMap<String, Challenged>();
	
	
	static {
	     for (Challenged e : Challenged.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Challenged getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Challenged getByValue(String value) {
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
	private Challenged(int id, String value, String desc) {
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
