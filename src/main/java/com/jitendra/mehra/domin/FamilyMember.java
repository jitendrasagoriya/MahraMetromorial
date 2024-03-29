package com.jitendra.mehra.domin;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.jitendra.mehra.enums.MotherOccupation;
import com.jitendra.mehra.enums.Relation;

@Entity
@Table(name="FAMILYMEMBER")
public class FamilyMember implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="PERSONID", nullable = false)
	private Long personId;
	
	@Column(name="USERNAME", nullable = false)
	private String userName;
	
	@Column(name="NAME", nullable = true)
	private String name;
	
	@Column(name="RELATION", nullable = false)
	private Relation relation;
	
	@Column(name="DOB", nullable = true)
	private Date dob;
	
	@Column(name="GOTRA", nullable = true)
	private String gotra;
	
	@Column(name="FAMILYGOTRA", nullable = true)
	private String familyGotra;
	
	@Column(name="OCCUPATION", nullable = true)
	private MotherOccupation occupation;
	
	@Column(name="SALARY", nullable = true)
	private String salary;
	
	@Transient
	private Boolean isEdit;

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
	public MotherOccupation getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(MotherOccupation occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the isEdit
	 */
	public Boolean getIsEdit() {
		return isEdit;
	}

	/**
	 * @param isEdit the isEdit to set
	 */
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	/**
	 * @return the familyGotra
	 */
	public String getFamilyGotra() {
		return familyGotra;
	}

	/**
	 * @param familyGotra the familyGotra to set
	 */
	public void setFamilyGotra(String familyGotra) {
		this.familyGotra = familyGotra;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((familyGotra == null) ? 0 : familyGotra.hashCode());
		result = prime * result + ((gotra == null) ? 0 : gotra.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isEdit == null) ? 0 : isEdit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((personId == null) ? 0 : personId.hashCode());
		result = prime * result + ((relation == null) ? 0 : relation.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamilyMember other = (FamilyMember) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (familyGotra == null) {
			if (other.familyGotra != null)
				return false;
		} else if (!familyGotra.equals(other.familyGotra))
			return false;
		if (gotra == null) {
			if (other.gotra != null)
				return false;
		} else if (!gotra.equals(other.gotra))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isEdit == null) {
			if (other.isEdit != null)
				return false;
		} else if (!isEdit.equals(other.isEdit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupation != other.occupation)
			return false;
		if (personId == null) {
			if (other.personId != null)
				return false;
		} else if (!personId.equals(other.personId))
			return false;
		if (relation != other.relation)
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FamilyMember [id=" + id + ", personId=" + personId + ", userName=" + userName + ", name=" + name
				+ ", relation=" + relation + ", dob=" + dob + ", gotra=" + gotra + ", familyGotra=" + familyGotra
				+ ", occupation=" + occupation + ", salary=" + salary + ", isEdit=" + isEdit + "]";
	}
	
	
	

}
