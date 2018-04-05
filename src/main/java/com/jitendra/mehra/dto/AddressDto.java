package com.jitendra.mehra.dto;

public class AddressDto {
	
	private String houseNo;
	private String lane;
	private String colony;
	private String city;
	private String state;
	private String country;
	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}
	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	/**
	 * @return the lane
	 */
	public String getLane() {
		return lane;
	}
	/**
	 * @param lane the lane to set
	 */
	public void setLane(String lane) {
		this.lane = lane;
	}
	/**
	 * @return the colony
	 */
	public String getColony() {
		return colony;
	}
	/**
	 * @param colony the colony to set
	 */
	public void setColony(String colony) {
		this.colony = colony;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressDto [houseNo=" + houseNo + ", lane=" + lane + ", colony=" + colony + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
	

}
