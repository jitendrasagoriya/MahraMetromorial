package com.jitendra.mehra.dto;

public class EducationDto {
	
	private String aboutEducation;
	private CollageDetailsDto collageDetail  ;
	/**
	 * @return the aboutEducation
	 */
	public String getAboutEducation() {
		return aboutEducation;
	}
	/**
	 * @param aboutEducation the aboutEducation to set
	 */
	public void setAboutEducation(String aboutEducation) {
		this.aboutEducation = aboutEducation;
	}
	/**
	 * @return the collageDetail
	 */
	public CollageDetailsDto getCollageDetail() {
		return collageDetail;
	}
	/**
	 * @param collageDetail the collageDetail to set
	 */
	public void setCollageDetail(CollageDetailsDto collageDetail) {
		this.collageDetail = collageDetail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EducationDto [aboutEducation=" + aboutEducation + ", collageDetail=" + collageDetail + "]";
	}
	
	

}
