package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum RequestStatus {
	
	SEND(0,"SEND"),
	ACCEPT(1,"ACCEPT"),
	DECLINE(2,"DECLINE"),
	WAITING(3,"WAITING");
	
	
	
	private static final Map<Integer, RequestStatus> byId = new HashMap<>();
	private static final Map<String, RequestStatus> byValue = new HashMap<>();
	
	
	static {
	     for (RequestStatus e : RequestStatus.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getVal(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getVal());
	            }
	    }
	 }
	
	
	public static RequestStatus getById(int id) {
	    return byId.get(id);
	 }
	 
	public static RequestStatus getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String val;

	/**
	 * @param id
	 * @param val
	 */
	private RequestStatus(int id, String val) {
		this.id = id;
		this.val = val;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the val
	 */
	public String getVal() {
		return val;
	}
	
	
	
	
	

}
