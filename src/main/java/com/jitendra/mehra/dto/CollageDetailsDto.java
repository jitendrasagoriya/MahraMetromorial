package com.jitendra.mehra.dto;

import org.springframework.social.linkedin.api.Education;

import com.jitendra.mehra.enums.Qualification;

public class CollageDetailsDto {
	
	 private Qualification highestEducation;
	 private String schoolCollegeName ;
	 private String subject ;
	 private String pgDegree ;
	 private String pgCollege ;
	 private String ugDegree ;
	 private String ugCollege ;
	 private String xIISubject ;
	 private String xSubject ;
	 private String university ;
	/**
	 * @return the highestEducation
	 */
	public Qualification getHighestEducation() {
		return highestEducation;
	}
	/**
	 * @param highestEducation the highestEducation to set
	 */
	public void setHighestEducation(Qualification highestEducation) {
		this.highestEducation = highestEducation;
	}
	/**
	 * @return the schoolCollegeName
	 */
	public String getSchoolCollegeName() {
		return schoolCollegeName;
	}
	/**
	 * @param schoolCollegeName the schoolCollegeName to set
	 */
	public void setSchoolCollegeName(String schoolCollegeName) {
		this.schoolCollegeName = schoolCollegeName;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the pgDegree
	 */
	public String getPgDegree() {
		return pgDegree;
	}
	/**
	 * @param pgDegree the pgDegree to set
	 */
	public void setPgDegree(String pgDegree) {
		this.pgDegree = pgDegree;
	}
	/**
	 * @return the pgCollege
	 */
	public String getPgCollege() {
		return pgCollege;
	}
	/**
	 * @param pgCollege the pgCollege to set
	 */
	public void setPgCollege(String pgCollege) {
		this.pgCollege = pgCollege;
	}
	/**
	 * @return the ugDegree
	 */
	public String getUgDegree() {
		return ugDegree;
	}
	/**
	 * @param ugDegree the ugDegree to set
	 */
	public void setUgDegree(String ugDegree) {
		this.ugDegree = ugDegree;
	}
	/**
	 * @return the ugCollege
	 */
	public String getUgCollege() {
		return ugCollege;
	}
	/**
	 * @param ugCollege the ugCollege to set
	 */
	public void setUgCollege(String ugCollege) {
		this.ugCollege = ugCollege;
	}
	/**
	 * @return the xIISubject
	 */
	public String getxIISubject() {
		return xIISubject;
	}
	/**
	 * @param xIISubject the xIISubject to set
	 */
	public void setxIISubject(String xIISubject) {
		this.xIISubject = xIISubject;
	}
	/**
	 * @return the xSubject
	 */
	public String getxSubject() {
		return xSubject;
	}
	/**
	 * @param xSubject the xSubject to set
	 */
	public void setxSubject(String xSubject) {
		this.xSubject = xSubject;
	}
	/**
	 * @return the university
	 */
	public String getUniversity() {
		return university;
	}
	/**
	 * @param university the university to set
	 */
	public void setUniversity(String university) {
		this.university = university;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollageDetailsDto [highestEducation=" + highestEducation + ", schoolCollegeName=" + schoolCollegeName
				+ ", subject=" + subject + ", pgDegree=" + pgDegree + ", pgCollege=" + pgCollege + ", ugDegree="
				+ ugDegree + ", ugCollege=" + ugCollege + ", xIISubject=" + xIISubject + ", xSubject=" + xSubject
				+ ", university=" + university + "]";
	}

	 
	 
}
