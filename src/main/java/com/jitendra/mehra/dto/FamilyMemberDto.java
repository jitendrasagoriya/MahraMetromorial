package com.jitendra.mehra.dto;

import java.sql.Date;

import com.jitendra.mehra.enums.Relation;

public class FamilyMemberDto {
	
	private Long id;
	private Long  personId;
	private String userName;
	private String name;
	private Relation relation;
	private Date dob;
	private String gotra;
	private String  occupation;
	private long salary;
	private String gotraSave;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the personId
	 */
	public Long getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the relation
	 */
	public Relation getRelation() {
		return relation;
	}
	/**
	 * @param relation the relation to set
	 */
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the gotra
	 */
	public String getGotra() {
		return gotra;
	}
	/**
	 * @param gotra the gotra to set
	 */
	public void setGotra(String gotra) {
		this.gotra = gotra;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}
	/**
	 * @return the gotraSave
	 */
	public String getGotraSave() {
		return gotraSave;
	}
	/**
	 * @param gotraSave the gotraSave to set
	 */
	public void setGotraSave(String gotraSave) {
		this.gotraSave = gotraSave;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FamilyMemberDto [id=" + id + ", personId=" + personId + ", userName=" + userName + ", name=" + name
				+ ", relation=" + relation + ", dob=" + dob + ", gotra=" + gotra + ", occupation=" + occupation
				+ ", salary=" + salary + ", gotraSave=" + gotraSave + "]";
	}
	
	

}
