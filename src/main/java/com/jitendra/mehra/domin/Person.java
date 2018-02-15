package com.jitendra.mehra.domin;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Challenged;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;

@Entity
@Table(name="PERSON")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="FIRSTNAME",nullable=false,length = 50)
	private String fName;
	
	@Column(name="MIDDLENAME",nullable=true,length = 50)
	private String mName;
	
	@Column(name="LASTENAME",nullable=false,length = 50)
	private String lName;
	
	
	@Column(name="DATEODBIRTH",nullable=false)
	private Date dob;
	
	@Column(name="TIMEOFBIRTH",nullable=false)
	private String tob;
	
	@Column(name="PLACEOFBIRTH",nullable=false,length = 100)
	private String placeOfBirth;
	
	@Column(name="QUALIFICATION",nullable=false)
	private Qualification qualification;
	
	@Column(name="RELIGION",nullable=false,length = 50)
	private String religion;
	
	@Column(name="CAST",nullable=false,length = 50)
	private String cast;
	
	@Column(name="GOTRA",nullable=false,length = 50)
	private String gotra;
	
	@Column(name="GOTRATOSAVE",nullable=false,length = 200)
	private String gotraToSave;
	
	@Column(name="COLLAGE",nullable=false,length = 200)
	private String nameOfCollage;
	
	@Column(name="INCOME",nullable=false)
	private long income;
	
	@Column(name="FAMILYINCOME",nullable=false)
	private long familyIncome;
	
	@Column(name="CITY",nullable=false,length = 100)
	private String city;
	
	@Column(name="NOOFSISTER",nullable=false)
	private int noOfSisters;
	
	@Column(name="NOOFBROTHER",nullable=false)
	private int noOfBrother;
	
	@Column(name="HEIGHT",nullable=false)
	private String height;
	
	@Column(name="BODYTYPE",nullable=false)
	private BodyType bodyType;
	
	@Column(name="COMPLEXION",nullable=false)
	private Complexion complexion;
	
	@Column(name="CHALLENGED",nullable=false)
	private Challenged challenged;
	
	@Column(name="PRIMERYCONTACTNO",nullable=false)
	private String primeryContactNo;
	
	@Column(name="SECOUNDRYCONTACTNO",nullable=true)
	private String secoundryContactNo;
	
	@Column(name="STATUS",nullable=true)
	private PersonStatus personStatus;

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
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
	 * @return the tob
	 */
	public String getTob() {
		return tob;
	}

	/**
	 * @param tob the tob to set
	 */
	public void setTob(String tob) {
		this.tob = tob;
	}

	/**
	 * @return the placeOfBirth
	 */
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	/**
	 * @param placeOfBirth the placeOfBirth to set
	 */
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	/**
	 * @return the qualification
	 */
	public Qualification getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * @return the cast
	 */
	public String getCast() {
		return cast;
	}

	/**
	 * @param cast the cast to set
	 */
	public void setCast(String cast) {
		this.cast = cast;
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
	 * @return the gotraToSave
	 */
	public String getGotraToSave() {
		return gotraToSave;
	}

	/**
	 * @param gotraToSave the gotraToSave to set
	 */
	public void setGotraToSave(String gotraToSave) {
		this.gotraToSave = gotraToSave;
	}

	/**
	 * @return the nameOfCollage
	 */
	public String getNameOfCollage() {
		return nameOfCollage;
	}

	/**
	 * @param nameOfCollage the nameOfCollage to set
	 */
	public void setNameOfCollage(String nameOfCollage) {
		this.nameOfCollage = nameOfCollage;
	}

	/**
	 * @return the income
	 */
	public long getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(long income) {
		this.income = income;
	}

	/**
	 * @return the familyIncome
	 */
	public long getFamilyIncome() {
		return familyIncome;
	}

	/**
	 * @param familyIncome the familyIncome to set
	 */
	public void setFamilyIncome(long familyIncome) {
		this.familyIncome = familyIncome;
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
	 * @return the noOfSisters
	 */
	public int getNoOfSisters() {
		return noOfSisters;
	}

	/**
	 * @param noOfSisters the noOfSisters to set
	 */
	public void setNoOfSisters(int noOfSisters) {
		this.noOfSisters = noOfSisters;
	}

	/**
	 * @return the noOfBrother
	 */
	public int getNoOfBrother() {
		return noOfBrother;
	}

	/**
	 * @param noOfBrother the noOfBrother to set
	 */
	public void setNoOfBrother(int noOfBrother) {
		this.noOfBrother = noOfBrother;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the bodyType
	 */
	public BodyType getBodyType() {
		return bodyType;
	}

	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	/**
	 * @return the complexion
	 */
	public Complexion getComplexion() {
		return complexion;
	}

	/**
	 * @param complexion the complexion to set
	 */
	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}

	/**
	 * @return the challenged
	 */
	public Challenged getChallenged() {
		return challenged;
	}

	/**
	 * @param challenged the challenged to set
	 */
	public void setChallenged(Challenged challenged) {
		this.challenged = challenged;
	}

	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the primeryContactNo
	 */
	public String getPrimeryContactNo() {
		return primeryContactNo;
	}

	/**
	 * @param primeryContactNo the primeryContactNo to set
	 */
	public void setPrimeryContactNo(String primeryContactNo) {
		this.primeryContactNo = primeryContactNo;
	}

	/**
	 * @return the secoundryContactNo
	 */
	public String getSecoundryContactNo() {
		return secoundryContactNo;
	}

	/**
	 * @param secoundryContactNo the secoundryContactNo to set
	 */
	public void setSecoundryContactNo(String secoundryContactNo) {
		this.secoundryContactNo = secoundryContactNo;
	}
	
	
	

	/**
	 * @return the personStatus
	 */
	public PersonStatus getPersonStatus() {
		return personStatus;
	}

	/**
	 * @param personStatus the personStatus to set
	 */
	public void setPersonStatus(PersonStatus personStatus) {
		this.personStatus = personStatus;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result + ((cast == null) ? 0 : cast.hashCode());
		result = prime * result + ((challenged == null) ? 0 : challenged.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((complexion == null) ? 0 : complexion.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + (int) (familyIncome ^ (familyIncome >>> 32));
		result = prime * result + ((gotra == null) ? 0 : gotra.hashCode());
		result = prime * result + ((gotraToSave == null) ? 0 : gotraToSave.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (income ^ (income >>> 32));
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((nameOfCollage == null) ? 0 : nameOfCollage.hashCode());
		result = prime * result + noOfBrother;
		result = prime * result + noOfSisters;
		result = prime * result + ((personStatus == null) ? 0 : personStatus.hashCode());
		result = prime * result + ((placeOfBirth == null) ? 0 : placeOfBirth.hashCode());
		result = prime * result + ((primeryContactNo == null) ? 0 : primeryContactNo.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((secoundryContactNo == null) ? 0 : secoundryContactNo.hashCode());
		result = prime * result + ((tob == null) ? 0 : tob.hashCode());
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
		Person other = (Person) obj;
		if (bodyType != other.bodyType)
			return false;
		if (cast == null) {
			if (other.cast != null)
				return false;
		} else if (!cast.equals(other.cast))
			return false;
		if (challenged != other.challenged)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (complexion != other.complexion)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (familyIncome != other.familyIncome)
			return false;
		if (gotra == null) {
			if (other.gotra != null)
				return false;
		} else if (!gotra.equals(other.gotra))
			return false;
		if (gotraToSave == null) {
			if (other.gotraToSave != null)
				return false;
		} else if (!gotraToSave.equals(other.gotraToSave))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (id != other.id)
			return false;
		if (income != other.income)
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (nameOfCollage == null) {
			if (other.nameOfCollage != null)
				return false;
		} else if (!nameOfCollage.equals(other.nameOfCollage))
			return false;
		if (noOfBrother != other.noOfBrother)
			return false;
		if (noOfSisters != other.noOfSisters)
			return false;
		if (personStatus != other.personStatus)
			return false;
		if (placeOfBirth == null) {
			if (other.placeOfBirth != null)
				return false;
		} else if (!placeOfBirth.equals(other.placeOfBirth))
			return false;
		if (primeryContactNo == null) {
			if (other.primeryContactNo != null)
				return false;
		} else if (!primeryContactNo.equals(other.primeryContactNo))
			return false;
		if (qualification != other.qualification)
			return false;
		if (religion == null) {
			if (other.religion != null)
				return false;
		} else if (!religion.equals(other.religion))
			return false;
		if (secoundryContactNo == null) {
			if (other.secoundryContactNo != null)
				return false;
		} else if (!secoundryContactNo.equals(other.secoundryContactNo))
			return false;
		if (tob == null) {
			if (other.tob != null)
				return false;
		} else if (!tob.equals(other.tob))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", dob=" + dob
				+ ", tob=" + tob + ", placeOfBirth=" + placeOfBirth + ", qualification=" + qualification + ", religion="
				+ religion + ", cast=" + cast + ", gotra=" + gotra + ", gotraToSave=" + gotraToSave + ", nameOfCollage="
				+ nameOfCollage + ", income=" + income + ", familyIncome=" + familyIncome + ", city=" + city
				+ ", noOfSisters=" + noOfSisters + ", noOfBrother=" + noOfBrother + ", height=" + height + ", bodyType="
				+ bodyType + ", complexion=" + complexion + ", challenged=" + challenged + ", primeryContactNo="
				+ primeryContactNo + ", secoundryContactNo=" + secoundryContactNo + ", personStatus=" + personStatus
				+ "]";
	}
	
	
}
