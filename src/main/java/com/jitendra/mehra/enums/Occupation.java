package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Occupation {

	LOOKINGFORAJOB(1,"LOOKINGFORAJOB","Looking for a job"),
	NOTWORKING(2,"NOTWORKING","Not working"),
	ACTORMODEL(3,"ACTORMODEL","Actor/Model"),
	ADVERTISINGPROFESSIONAL(4,"ADVERTISINGPROFESSIONAL","Advertising Professional"),
	AGENT(5,"AGENT","Agent"),
	AIRHOSTESS(6,"AIRHOSTESS","Air Hostess"),
	ANALYST(7,"ANALYST","Analyst"),
	ARCHITECT(8,"ARCHITECT","Architect"),
	BPOITES(9,"BPOITES","BPO/ITeS"),
	BANKINGPROFESSIONAL(10,"BANKINGPROFESSIONAL","Banking Professional"),
	BEAUTICIAN(11,"BEAUTICIAN","Beautician"),
	BUSINESSPERSON(12,"BUSINESSPERSON","Businessperson"),
	CHARTEREDACCOUNTANT(13,"CHARTEREDACCOUNTANT","Chartered accountant"),
	CIVILSERVICES(14,"CIVILSERVICES","Civil Services (IAS/ IFS/ IPS/ IRS)"),
	CONSULTANT(15,"CONSULTANT","Consultant"),
	CORPORATECOMMUNICATION(16,"CORPORATECOMMUNICATION","Corporate Communication"),
	CORPORATEPLANNINGPROFESSIONAL(17,"CORPORATEPLANNINGPROFESSIONAL","Corporate Planning Professional"),
	CUSTOMERSERVICES(18,"CUSTOMERSERVICES","Customer Services"),
	CYBERNETWORKSECURITY(19,"CYBERNETWORKSECURITY","Cyber / Network Security"),
	DEFENCE(20,"DEFENCE","Defence"),
	DOCTOR(21,"DOCTOR","Doctor"),
	EDUCATIONPROFESSIONAL(22,"EDUCATIONPROFESSIONAL","Education Professional"),
	ENGINEERNONIT(23,"ENGINEERNONIT","Engineer - Non IT"),
	FARMING(24,"FARMING","Farming"),
	FASHIONDESIGNER(25,"FASHIONDESIGNER","Fashion Designer"),
	FILMPROFESSIONAL(26,"FILMPROFESSIONAL","Film Professional"),
	FINANCIALSERVICESACCOUNTING(27,"FINANCIALSERVICESACCOUNTING","Financial Services/Accounting"),
	FITNESSPROFESSIONAL(28,"FITNESSPROFESSIONAL","Fitness Professional"),
	GOVTSERVICES(29,"GOVTSERVICES","Govt. Services"),
	HRPROFESSIONAL(30,"HRPROFESSIONAL","HR Professional"),
	HARDWARETELECOM(31,"HARDWARETELECOM","Hardware/Telecom"),
	HEALTHCAREPROFESSIONAL(32,"HEALTHCAREPROFESSIONAL","Healthcare Professional"),
	HOTELSHOSPITALITYPROFESSIONAL(33,"HOTELSHOSPITALITYPROFESSIONAL","Hotels/Hospitality Professional"),
	INTERIORDESIGNER(34,"INTERIORDESIGNER","Interior Designer"),
	JOURNALIST(35,"JOURNALIST","Journalist"),
	LAWYERANDLEGALPROFESSIONAL(36,"LAWYERANDLEGALPROFESSIONAL","Lawyer/Legal Professional"),
	LOGISTICSSCMPROFESSIONAL(37,"LOGISTICSSCMPROFESSIONAL","Logistics/SCM Professional"),
	MANAGER(38,"MANAGER","Manager"),
	MARKETINGPROFESSIONAL(39,"MARKETINGPROFESSIONAL","Marketing Professional"),
	MEDIAPROFESSIONAL(40,"MEDIAPROFESSIONAL","Media Professional"),
	MERCHANTNAVY(41,"MERCHANTNAVY","Merchant Navy"),
	NGOSOCIALSERVICES(42,"NGOSOCIALSERVICES","NGO/Social Services"),
	NURSE(43,"NURSE","Nurse"),
	OFFICEADMIN(44,"OFFICEADMIN","Office Admin"),
	OPERATORTECHNICIAN(45,"OPERATORTECHNICIAN","Operator/Technician"),
	PHYSIOTHERAPIST(46,"PHYSIOTHERAPIST","Physiotherapist"),
	PILOT(47,"PILOT","Pilot"),
	POLICE(48,"POLICE","Police"),
	PRIVATESECURITY(49,"PRIVATESECURITY","Private Security"),
	PRODUCTMANAGER(50,"PRODUCTMANAGER","Product manager"),
	PROFESSORLECTURER(51,"PROFESSORLECTURER","Professor/Lecturer"),
	PROGRAMMANAGER(52,"PROGRAMMANAGER","Program Manager"),
	PROJECTMANAGERIT(53,"PROJECTMANAGERIT","Project Manager - IT"),
	PROJECTMANAGERNONI(54,"PROJECTMANAGERNONI","Project Manager - Non IT"),
	PSYCHOLOGIST(55,"PSYCHOLOGIST","Psychologist"),
	RESEARCHPROFESSIONAL(56,"RESEARCHPROFESSIONAL","Research Professional"),
	SALESPROFESSIONAL(57,"SALESPROFESSIONAL","Sales Professional"),
	SCIENTIST(58,"SCIENTIST","Scientist"),
	SECRETARYFRONTOFFICE(59,"SECRETARYFRONTOFFICE","Secretary/Front Office"),
	SECURITYPROFESSIONAL(60,"SECURITYPROFESSIONAL","Security Professional"),
	SELFEMPLOYED(61,"SELFEMPLOYED","Self Employed"),
	SOFTWAREPROFESSIONAL(62,"SOFTWAREPROFESSIONAL","Software Professional"),
	SPORTSPERSON(63,"SPORTSPERSON","Sportsperson"),
	STUDENT(64,"STUDENT","Student"),
	TEACHER(65,"TEACHER","Teacher"),
	TOPMANAGEMENT(66,"TOPMANAGEMENT","Top Management (CXO M.D. etc.)"),
	UIUXDESIGNER(67,"UIUXDESIGNER","UI/UX designer"),
	WEBGRAPHIDESIGN(68,"WEBGRAPHIDESIGN","Web/Graphic Design"),
	OTHERS(69,"OTHERS","Others");
	
	private int id;
	
	private String value;
	
	private String description;
	
	
	/**
	 * @param id
	 * @param value
	 * @param description
	 */
	private Occupation(int id, String value, String description) {
		this.id = id;
		this.value = value;
		this.description = description;
	}

	private static final Map<Integer, Occupation> byId = new HashMap<Integer, Occupation>();
	private static final Map<String, Occupation> byValue = new HashMap<String, Occupation>();
	
	static {
	     for (Occupation e :Occupation.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	public static Occupation getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Occupation getByValue(String value) {
		    return byValue.get(value);
	}

	/**
	 * @param id
	 * @param value
	 */
	private Occupation(int id, String value) {
		this.id = id;
		this.value = value;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
	
	
}
