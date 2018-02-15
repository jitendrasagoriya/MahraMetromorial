package com.jitendra.mehra.search;

public class Income {
	private String start;
	private String end;
	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}
	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}
	/**
	 * @param start
	 * @param end
	 */
	public Income(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}
	/**
	 * 
	 */
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
