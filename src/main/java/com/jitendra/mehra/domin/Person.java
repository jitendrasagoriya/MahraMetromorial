package com.jitendra.mehra.domin;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Challenged;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Drink;
import com.jitendra.mehra.enums.EatingHabit;
import com.jitendra.mehra.enums.FamilyStatus;
import com.jitendra.mehra.enums.FamilyType;
import com.jitendra.mehra.enums.FamilyValues;
import com.jitendra.mehra.enums.Gender;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Occupation;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.enums.Smoker;

@Entity
@Table(name="PERSON")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="ID",nullable=true,unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Id
	@Column(name="USERNAME",nullable=true,length = 50,unique = true)
	private String userName;
	
	@Column(name="FIRSTNAME",nullable=false,length = 50)
	private String fName;
	
	@Column(name="MIDDLENAME",nullable=true,length = 50)
	private String mName;
	
	@Column(name="LASTENAME",nullable=false,length = 50)
	private String lName;
	
	@Column(name="GENDER",nullable=true,length = 50,columnDefinition = "int default '0'")
	private Gender gender;	
	
	@Column(name="DATEODBIRTH",nullable=false)
	private Date dob;
	
	@Column(name="TIMEOFBIRTH",nullable=false)
	private String tob;
	
	@Column(name="PLACEOFBIRTH",nullable=false,length = 100)
	private String placeOfBirth;
	
	@Column(name="QUALIFICATION",nullable=false,columnDefinition = "int default '0'")
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
	
	@Column(name="NOOFSISTER",nullable=false ,columnDefinition = "int default '0'")
	private int noOfSisters;
	
	@Column(name="NOOFBROTHER",nullable=false,columnDefinition = "int default '0'")
	private int noOfBrother;
	
	@Column(name="NOOFMARRIEDSISTER",nullable=false ,columnDefinition = "int default '0'")
	private int noOfMarriedSisters;
	
	@Column(name="NOOFMARRIEDBROTHER",nullable=false,columnDefinition = "int default '0'")
	private int noOfMarriedBrother;
	
	@Column(name="HEIGHT",nullable=false)
	private String height;
	
	@Column(name="BODYTYPE",nullable=false,columnDefinition = "int default '0'")
	private BodyType bodyType;
	
	@Column(name="COMPLEXION",nullable=false,columnDefinition = "int default '0'")
	private Complexion complexion;
	
	@Column(name="CHALLENGED",nullable=false,columnDefinition = "int default '0'")
	private Challenged challenged;
	
	@Column(name="PRIMERYCONTACTNO",nullable=false)
	private String primeryContactNo;
	
	@Column(name="SECOUNDRYCONTACTNO",nullable=true)
	private String secoundryContactNo;
	
	@Column(name="STATUS",nullable=true,columnDefinition = "int default '0'")
	private PersonStatus personStatus;
	
	@Column(name="PROFILEPIC",nullable=true)
	private String profilePic;	
	
	@Column(name="MARITALSTATUS",nullable=true,columnDefinition = "int default '0'")	 
	private MaritalStatus maritalStatus;
	
	@Column(name="WEIGHT",nullable=true)	 
	private Integer weight;
	
	@Column(name="SMOKE",nullable=true,columnDefinition = "int default '0'")	 
	private Smoker somke;
	
	@Column(name="DRINK",nullable=true,columnDefinition = "int default '0'")	 
	private Drink drink;
	
	@Column(name="DOINGJOB",nullable=true)	 
	private Boolean doingJob;
	
	@Column(name="WISHTOJOB",nullable=true)	 
	private Boolean wishToJob;
	
	@Column(name="COMPANYNAME",nullable=true)	 
	private String companyName;
	
	@Column(name="DESGINATION",nullable=true)	 
	private String desgination;
	
	@Column(name="EATINGHABIT",nullable=true,columnDefinition = "int default '0'")	 
	private EatingHabit eatingHabit;
	
	@Column(name="ABOUTME",nullable=true)	 
	private String aboutMe;
	
	@Column(name="HOBBIES",nullable=true)	 
	private String hobbies;

	@Column(name="OCCUPATION",nullable=true)
	private Occupation occupation;	
	
	@Column(name="FAMILYSTATUS",nullable=true)
	private FamilyStatus familyStatus;
	
	@Column(name="FAMILYVALUES",nullable=true)
	private FamilyValues familyValues;
	
	@Column(name="FAMILYTYPE",nullable=true)
	private FamilyType familyType;
	
	@Column(name="ABOUTFAMILY",nullable=true,length = 200)	 
	private String aboutFamily;
	
	@Column(name="ABOUTJOB",nullable=true,length = 200)	 
	private String aboutJob;
	
	@Column(name="ABOUTPARTNER",nullable=true,length = 200)	 
	private String aboutPartner;
	
	@Column(name="LIVINGWITHPARANTS",nullable=true )	
	private Boolean livingWithParant;
	
	@Column(name="FOODANDCOOK",nullable=true ,length = 200 )
	private String foodAndCook;
	
	@Column(name="INTEREST",nullable=true )
	private String interest ;
	
	@Column(name="EMAIL",nullable=true )
	private String email ;
	
	@Column(name="SUBJECT",nullable=true )
	private String subject ;
	
	@Column(name="UNIVERSITY",nullable=true )
	private String university ;
	
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
	

	/**
	 * @return the profilePic
	 */
	public String getProfilePic() {
		return profilePic;
	}

	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the maritalStatus
	 */
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
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
	 * @return the weight
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	

	/**
	 * @return the somke
	 */
	public Smoker getSomke() {
		return somke;
	}

	/**
	 * @param somke the somke to set
	 */
	public void setSomke(Smoker somke) {
		this.somke = somke;
	}

	/**
	 * @return the drink
	 */
	public Drink getDrink() {
		return drink;
	}

	/**
	 * @param drink the drink to set
	 */
	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	/**
	 * @return the doingJob
	 */
	public Boolean getDoingJob() {
		return doingJob;
	}

	/**
	 * @param doingJob the doingJob to set
	 */
	public void setDoingJob(Boolean doingJob) {
		this.doingJob = doingJob;
	}

	/**
	 * @return the wishToJob
	 */
	public Boolean getWishToJob() {
		return wishToJob;
	}

	/**
	 * @param wishToJob the wishToJob to set
	 */
	public void setWishToJob(Boolean wishToJob) {
		this.wishToJob = wishToJob;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the desgination
	 */
	public String getDesgination() {
		return desgination;
	}

	/**
	 * @param desgination the desgination to set
	 */
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	/**
	 * @return the eatingHabit
	 */
	public EatingHabit getEatingHabit() {
		return eatingHabit;
	}

	/**
	 * @param eatingHabit the eatingHabit to set
	 */
	public void setEatingHabit(EatingHabit eatingHabit) {
		this.eatingHabit = eatingHabit;
	}

	/**
	 * @return the aboutMe
	 */
	public String getAboutMe() {
		return aboutMe;
	}

	/**
	 * @param aboutMe the aboutMe to set
	 */
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	
	/**
	 * @return the occupation
	 */
	public Occupation getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the noOfMarriedSisters
	 */
	public int getNoOfMarriedSisters() {
		return noOfMarriedSisters;
	}

	/**
	 * @param noOfMarriedSisters the noOfMarriedSisters to set
	 */
	public void setNoOfMarriedSisters(int noOfMarriedSisters) {
		this.noOfMarriedSisters = noOfMarriedSisters;
	}

	/**
	 * @return the noOfMarriedBrother
	 */
	public int getNoOfMarriedBrother() {
		return noOfMarriedBrother;
	}

	/**
	 * @param noOfMarriedBrother the noOfMarriedBrother to set
	 */
	public void setNoOfMarriedBrother(int noOfMarriedBrother) {
		this.noOfMarriedBrother = noOfMarriedBrother;
	}

	/**
	 * @return the familyStatus
	 */
	public FamilyStatus getFamilyStatus() {
		return familyStatus;
	}

	/**
	 * @param familyStatus the familyStatus to set
	 */
	public void setFamilyStatus(FamilyStatus familyStatus) {
		this.familyStatus = familyStatus;
	}

	/**
	 * @return the familyValues
	 */
	public FamilyValues getFamilyValues() {
		return familyValues;
	}

	/**
	 * @param familyValues the familyValues to set
	 */
	public void setFamilyValues(FamilyValues familyValues) {
		this.familyValues = familyValues;
	}

	/**
	 * @return the familyType
	 */
	public FamilyType getFamilyType() {
		return familyType;
	}

	/**
	 * @param familyType the familyType to set
	 */
	public void setFamilyType(FamilyType familyType) {
		this.familyType = familyType;
	}

	/**
	 * @return the aboutFamily
	 */
	public String getAboutFamily() {
		return aboutFamily;
	}

	/**
	 * @param aboutFamily the aboutFamily to set
	 */
	public void setAboutFamily(String aboutFamily) {
		this.aboutFamily = aboutFamily;
	}

	/**
	 * @return the aboutJob
	 */
	public String getAboutJob() {
		return aboutJob;
	}

	/**
	 * @param aboutJob the aboutJob to set
	 */
	public void setAboutJob(String aboutJob) {
		this.aboutJob = aboutJob;
	}

	/**
	 * @return the aboutPartner
	 */
	public String getAboutPartner() {
		return aboutPartner;
	}

	/**
	 * @param aboutPartner the aboutPartner to set
	 */
	public void setAboutPartner(String aboutPartner) {
		this.aboutPartner = aboutPartner;
	}

	/**
	 * @return the livingWithParant
	 */
	public Boolean getLivingWithParant() {
		return livingWithParant;
	}

	/**
	 * @param livingWithParant the livingWithParant to set
	 */
	public void setLivingWithParant(Boolean livingWithParant) {
		this.livingWithParant = livingWithParant;
	}

	/**
	 * @return the foodAndCook
	 */
	public String getFoodAndCook() {
		return foodAndCook;
	}

	/**
	 * @param foodAndCook the foodAndCook to set
	 */
	public void setFoodAndCook(String foodAndCook) {
		this.foodAndCook = foodAndCook;
	}

	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aboutFamily == null) ? 0 : aboutFamily.hashCode());
		result = prime * result + ((aboutJob == null) ? 0 : aboutJob.hashCode());
		result = prime * result + ((aboutMe == null) ? 0 : aboutMe.hashCode());
		result = prime * result + ((aboutPartner == null) ? 0 : aboutPartner.hashCode());
		result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
		result = prime * result + ((cast == null) ? 0 : cast.hashCode());
		result = prime * result + ((challenged == null) ? 0 : challenged.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((complexion == null) ? 0 : complexion.hashCode());
		result = prime * result + ((desgination == null) ? 0 : desgination.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((doingJob == null) ? 0 : doingJob.hashCode());
		result = prime * result + ((drink == null) ? 0 : drink.hashCode());
		result = prime * result + ((eatingHabit == null) ? 0 : eatingHabit.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + (int) (familyIncome ^ (familyIncome >>> 32));
		result = prime * result + ((familyStatus == null) ? 0 : familyStatus.hashCode());
		result = prime * result + ((familyType == null) ? 0 : familyType.hashCode());
		result = prime * result + ((familyValues == null) ? 0 : familyValues.hashCode());
		result = prime * result + ((foodAndCook == null) ? 0 : foodAndCook.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((gotra == null) ? 0 : gotra.hashCode());
		result = prime * result + ((gotraToSave == null) ? 0 : gotraToSave.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((hobbies == null) ? 0 : hobbies.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (income ^ (income >>> 32));
		result = prime * result + ((interest == null) ? 0 : interest.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((livingWithParant == null) ? 0 : livingWithParant.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((nameOfCollage == null) ? 0 : nameOfCollage.hashCode());
		result = prime * result + noOfBrother;
		result = prime * result + noOfMarriedBrother;
		result = prime * result + noOfMarriedSisters;
		result = prime * result + noOfSisters;
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((personStatus == null) ? 0 : personStatus.hashCode());
		result = prime * result + ((placeOfBirth == null) ? 0 : placeOfBirth.hashCode());
		result = prime * result + ((primeryContactNo == null) ? 0 : primeryContactNo.hashCode());
		result = prime * result + ((profilePic == null) ? 0 : profilePic.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((secoundryContactNo == null) ? 0 : secoundryContactNo.hashCode());
		result = prime * result + ((somke == null) ? 0 : somke.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((tob == null) ? 0 : tob.hashCode());
		result = prime * result + ((university == null) ? 0 : university.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((wishToJob == null) ? 0 : wishToJob.hashCode());
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
		if (aboutFamily == null) {
			if (other.aboutFamily != null)
				return false;
		} else if (!aboutFamily.equals(other.aboutFamily))
			return false;
		if (aboutJob == null) {
			if (other.aboutJob != null)
				return false;
		} else if (!aboutJob.equals(other.aboutJob))
			return false;
		if (aboutMe == null) {
			if (other.aboutMe != null)
				return false;
		} else if (!aboutMe.equals(other.aboutMe))
			return false;
		if (aboutPartner == null) {
			if (other.aboutPartner != null)
				return false;
		} else if (!aboutPartner.equals(other.aboutPartner))
			return false;
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
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (complexion != other.complexion)
			return false;
		if (desgination == null) {
			if (other.desgination != null)
				return false;
		} else if (!desgination.equals(other.desgination))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (doingJob == null) {
			if (other.doingJob != null)
				return false;
		} else if (!doingJob.equals(other.doingJob))
			return false;
		if (drink != other.drink)
			return false;
		if (eatingHabit != other.eatingHabit)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (familyIncome != other.familyIncome)
			return false;
		if (familyStatus != other.familyStatus)
			return false;
		if (familyType != other.familyType)
			return false;
		if (familyValues != other.familyValues)
			return false;
		if (foodAndCook == null) {
			if (other.foodAndCook != null)
				return false;
		} else if (!foodAndCook.equals(other.foodAndCook))
			return false;
		if (gender != other.gender)
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
		if (hobbies == null) {
			if (other.hobbies != null)
				return false;
		} else if (!hobbies.equals(other.hobbies))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (income != other.income)
			return false;
		if (interest == null) {
			if (other.interest != null)
				return false;
		} else if (!interest.equals(other.interest))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (livingWithParant == null) {
			if (other.livingWithParant != null)
				return false;
		} else if (!livingWithParant.equals(other.livingWithParant))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (maritalStatus != other.maritalStatus)
			return false;
		if (nameOfCollage == null) {
			if (other.nameOfCollage != null)
				return false;
		} else if (!nameOfCollage.equals(other.nameOfCollage))
			return false;
		if (noOfBrother != other.noOfBrother)
			return false;
		if (noOfMarriedBrother != other.noOfMarriedBrother)
			return false;
		if (noOfMarriedSisters != other.noOfMarriedSisters)
			return false;
		if (noOfSisters != other.noOfSisters)
			return false;
		if (occupation != other.occupation)
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
		if (profilePic == null) {
			if (other.profilePic != null)
				return false;
		} else if (!profilePic.equals(other.profilePic))
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
		if (somke != other.somke)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (tob == null) {
			if (other.tob != null)
				return false;
		} else if (!tob.equals(other.tob))
			return false;
		if (university == null) {
			if (other.university != null)
				return false;
		} else if (!university.equals(other.university))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (wishToJob == null) {
			if (other.wishToJob != null)
				return false;
		} else if (!wishToJob.equals(other.wishToJob))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", userName=" + userName + ", fName=" + fName + ", mName=" + mName + ", lName="
				+ lName + ", gender=" + gender + ", dob=" + dob + ", tob=" + tob + ", placeOfBirth=" + placeOfBirth
				+ ", qualification=" + qualification + ", religion=" + religion + ", cast=" + cast + ", gotra=" + gotra
				+ ", gotraToSave=" + gotraToSave + ", nameOfCollage=" + nameOfCollage + ", income=" + income
				+ ", familyIncome=" + familyIncome + ", city=" + city + ", noOfSisters=" + noOfSisters
				+ ", noOfBrother=" + noOfBrother + ", noOfMarriedSisters=" + noOfMarriedSisters
				+ ", noOfMarriedBrother=" + noOfMarriedBrother + ", height=" + height + ", bodyType=" + bodyType
				+ ", complexion=" + complexion + ", challenged=" + challenged + ", primeryContactNo=" + primeryContactNo
				+ ", secoundryContactNo=" + secoundryContactNo + ", personStatus=" + personStatus + ", profilePic="
				+ profilePic + ", maritalStatus=" + maritalStatus + ", weight=" + weight + ", somke=" + somke
				+ ", drink=" + drink + ", doingJob=" + doingJob + ", wishToJob=" + wishToJob + ", companyName="
				+ companyName + ", desgination=" + desgination + ", eatingHabit=" + eatingHabit + ", aboutMe=" + aboutMe
				+ ", hobbies=" + hobbies + ", occupation=" + occupation + ", familyStatus=" + familyStatus
				+ ", familyValues=" + familyValues + ", familyType=" + familyType + ", aboutFamily=" + aboutFamily
				+ ", aboutJob=" + aboutJob + ", aboutPartner=" + aboutPartner + ", livingWithParant=" + livingWithParant
				+ ", foodAndCook=" + foodAndCook + ", interest=" + interest + ", email=" + email + ", subject="
				+ subject + ", university=" + university + "]";
	}
	
	
}
