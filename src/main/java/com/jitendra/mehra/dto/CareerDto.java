package com.jitendra.mehra.dto;

public class CareerDto {
	
	private String about;
	private CareerDetailDto careerDetail ;
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the careerDetail
	 */
	public CareerDetailDto getCareerDetail() {
		return careerDetail;
	}
	/**
	 * @param careerDetail the careerDetail to set
	 */
	public void setCareerDetail(CareerDetailDto careerDetail) {
		this.careerDetail = careerDetail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CareerDto [about=" + about + ", careerDetail=" + careerDetail + "]";
	}
	
	

}
