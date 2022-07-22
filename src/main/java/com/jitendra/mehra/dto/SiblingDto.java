package com.jitendra.mehra.dto;

public class SiblingDto {
	
	private int noOfBrothers ;
	private int noOfSister;
	private int marriedBrothers;
	private int marriedSister;
	/**
	 * @return the noOfBrothers
	 */
	public int getNoOfBrothers() {
		return noOfBrothers;
	}
	/**
	 * @param noOfBrothers the noOfBrothers to set
	 */
	public void setNoOfBrothers(int noOfBrothers) {
		this.noOfBrothers = noOfBrothers;
	}
	/**
	 * @return the noOfSister
	 */
	public int getNoOfSister() {
		return noOfSister;
	}
	/**
	 * @param noOfSister the noOfSister to set
	 */
	public void setNoOfSister(int noOfSister) {
		this.noOfSister = noOfSister;
	}
	/**
	 * @return the marriedBrothers
	 */
	public int getMarriedBrothers() {
		return marriedBrothers;
	}
	/**
	 * @param marriedBrothers the marriedBrothers to set
	 */
	public void setMarriedBrothers(int marriedBrothers) {
		this.marriedBrothers = marriedBrothers;
	}
	/**
	 * @return the marriedSister
	 */
	public int getMarriedSister() {
		return marriedSister;
	}
	/**
	 * @param marriedSister the marriedSister to set
	 */
	public void setMarriedSister(int marriedSister) {
		this.marriedSister = marriedSister;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SiblingDto [noOfBrothers=" + noOfBrothers + ", noOfSister=" + noOfSister + ", marriedBrothers="
				+ marriedBrothers + ", marriedSister=" + marriedSister + "]";
	}
	
	

}
