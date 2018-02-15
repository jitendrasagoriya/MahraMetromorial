package com.jitendra.mehra.enums;

public enum RequestStatus {
	
	SEND(0,"SEND"),
	ACCEPT(1,"ACCEPT"),
	DECLINE(2,"DECLINE"),
	WAITING(3,"WAITING");
	
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
