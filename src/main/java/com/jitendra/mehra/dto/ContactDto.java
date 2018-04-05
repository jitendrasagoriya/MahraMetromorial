package com.jitendra.mehra.dto;

public class ContactDto {
	
	private Integer mobileNumber;
	private Integer mobileNumber2;
	private AddressDto address;
	private String email ;
	private String landline;
	/**
	 * @return the mobileNumber
	 */
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the mobileNumber2
	 */
	public Integer getMobileNumber2() {
		return mobileNumber2;
	}
	/**
	 * @param mobileNumber2 the mobileNumber2 to set
	 */
	public void setMobileNumber2(Integer mobileNumber2) {
		this.mobileNumber2 = mobileNumber2;
	}
	/**
	 * @return the address
	 */
	public AddressDto getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the landline
	 */
	public String getLandline() {
		return landline;
	}
	/**
	 * @param landline the landline to set
	 */
	public void setLandline(String landline) {
		this.landline = landline;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactDto [mobileNumber=" + mobileNumber + ", mobileNumber2=" + mobileNumber2 + ", address=" + address
				+ ", email=" + email + ", landline=" + landline + "]";
	}
	
	

}
