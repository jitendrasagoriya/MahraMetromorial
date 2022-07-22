package com.jitendra.mehra.dto;

import java.sql.Date;
import java.sql.Time;

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

public class PersonDto {
	private Long id;
	private String userName;
	private String fName;
	private String mName;
	private String lName ;
	private Gender gender;
	private Date dob ;
	private Time tob;
	private String placeOfBirth;
	private Qualification qualification;
	private String religion;
	private String cast;
	private String gotra;
	private String gotraToSave;
	private String nameOfCollage;
	private Float income;
	private Float familyIncome;
	private String city;
	private int  noOfSisters;
	private int noOfBrother;
	private int noOfMarriedSisters;
	private int noOfMarriedBrother ;
	private int height  ;
	private BodyType bodyType  ;
	private Complexion complexion  ;
	private Challenged challenged ;
	private Integer primeryContactNo  ;
	private Integer secoundryContactNo ;
	private PersonStatus personStatus ;
	private String profilePic ;
	private MaritalStatus maritalStatus ;
	private int weight ;
	private Smoker somke ;
	private Drink drink ;
	private Boolean doingJob ;
	private Boolean wishToJob ;
	private String companyName ;
	private Occupation desgination ;
	private EatingHabit eatingHabit ;
	private String aboutMe ;
	private String collageName ;
	private String hobbies ;
	private Occupation occupation ;
	private String univercity ;
	private String subject ;
	private FamilyStatus familyStatus ;
	private FamilyValues familyValues ;
	private FamilyType familyType ;
	private String aboutFamily ;
	private String aboutJob ;
	private String aboutPartner ;
	private Boolean livingWithParants ;
	private String foodAndCook ;
	private String interest ;
	private String email ;
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
	public Time getTob() {
		return tob;
	}
	/**
	 * @param tob the tob to set
	 */
	public void setTob(Time tob) {
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
	public Float getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(Float income) {
		this.income = income;
	}
	/**
	 * @return the familyIncome
	 */
	public Float getFamilyIncome() {
		return familyIncome;
	}
	/**
	 * @param familyIncome the familyIncome to set
	 */
	public void setFamilyIncome(Float familyIncome) {
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
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
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
	 * @return the primeryContactNo
	 */
	public Integer getPrimeryContactNo() {
		return primeryContactNo;
	}
	/**
	 * @param primeryContactNo the primeryContactNo to set
	 */
	public void setPrimeryContactNo(Integer primeryContactNo) {
		this.primeryContactNo = primeryContactNo;
	}
	/**
	 * @return the secoundryContactNo
	 */
	public Integer getSecoundryContactNo() {
		return secoundryContactNo;
	}
	/**
	 * @param secoundryContactNo the secoundryContactNo to set
	 */
	public void setSecoundryContactNo(Integer secoundryContactNo) {
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
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
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
	public Occupation getDesgination() {
		return desgination;
	}
	/**
	 * @param desgination the desgination to set
	 */
	public void setDesgination(Occupation desgination) {
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
	 * @return the collageName
	 */
	public String getCollageName() {
		return collageName;
	}
	/**
	 * @param collageName the collageName to set
	 */
	public void setCollageName(String collageName) {
		this.collageName = collageName;
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
	 * @return the univercity
	 */
	public String getUnivercity() {
		return univercity;
	}
	/**
	 * @param univercity the univercity to set
	 */
	public void setUnivercity(String univercity) {
		this.univercity = univercity;
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
	 * @return the livingWithParants
	 */
	public Boolean getLivingWithParants() {
		return livingWithParants;
	}
	/**
	 * @param livingWithParants the livingWithParants to set
	 */
	public void setLivingWithParants(Boolean livingWithParants) {
		this.livingWithParants = livingWithParants;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonDto [id=" + id + ", userName=" + userName + ", fName=" + fName + ", mName=" + mName + ", lName="
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
				+ ", collageName=" + collageName + ", hobbies=" + hobbies + ", occupation=" + occupation
				+ ", univercity=" + univercity + ", subject=" + subject + ", familyStatus=" + familyStatus
				+ ", familyValues=" + familyValues + ", familyType=" + familyType + ", aboutFamily=" + aboutFamily
				+ ", aboutJob=" + aboutJob + ", aboutPartner=" + aboutPartner + ", livingWithParants="
				+ livingWithParants + ", foodAndCook=" + foodAndCook + ", interest=" + interest + ", email=" + email
				+ "]";
	}
	
	
	
}
