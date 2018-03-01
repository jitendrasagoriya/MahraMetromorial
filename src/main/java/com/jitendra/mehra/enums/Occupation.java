package com.jitendra.mehra.enums;

import java.util.HashMap;
import java.util.Map;

public enum Occupation {

	LOOKINGFORAJOB(1,"Looking for a job"),
	NOTWORKING(2,"Not working"),
	ACTORMODEL(3,"Actor/Model"),
	ADVERTISINGPROFESSIONAL(4,"Advertising Professional"),
	AGENT(5,"Agent"),
	AIRHOSTESS(6,"Air Hostess"),
	ANALYST(7,"Analyst"),
	ARCHITECT(8,"Architect"),
	BPOITES(9,"BPO/ITeS"),
	BANKINGPROFESSIONAL(10,"Banking Professional"),
	BEAUTICIAN(11,"Beautician"),
	BUSINESSPERSON(12,"Businessperson"),
	CHARTEREDACCOUNTANT(13,"Chartered accountant"),
	CIVILSERVICES(14,"Civil Services (IAS/ IFS/ IPS/ IRS)"),
	CONSULTANT(15,"Consultant"),
	CORPORATECOMMUNICATION(16,"Corporate Communication"),
	CORPORATEPLANNINGPROFESSIONAL(17,"Corporate Planning Professional"),
	CUSTOMERSERVICES(18,"Customer Services"),
	CYBERNETWORKSECURITY(19,"Cyber / Network Security"),
	DEFENCE(20,"Defence"),
	DOCTOR(21,"Doctor"),
	EDUCATIONPROFESSIONAL(22,"Education Professional"),
	ENGINEERNONIT(23,"Engineer - Non IT"),
	FARMING(24,"Farming"),
	FASHIONDESIGNER(25,"Fashion Designer"),
	FILMPROFESSIONAL(26,"Film Professional"),
	FINANCIALSERVICESACCOUNTING(27,"Financial Services/Accounting"),
	FITNESSPROFESSIONAL(28,"Fitness Professional"),
	GOVTSERVICES(29,"Govt. Services"),
	HRPROFESSIONAL(30,"HR Professional"),
	HARDWARETELECOM(31,"Hardware/Telecom"),
	HEALTHCAREPROFESSIONAL(32,"Healthcare Professional"),
	HOTELSHOSPITALITYPROFESSIONAL(33,"Hotels/Hospitality Professional"),
	INTERIORDESIGNER(34,"Interior Designer"),
	JOURNALIST(35,"Journalist"),
	LAWYERANDLEGALPROFESSIONAL(36,"Lawyer/Legal Professional"),
	LOGISTICSSCMPROFESSIONAL(37,"Logistics/SCM Professional"),
	MANAGER(38,"Manager"),
	MARKETINGPROFESSIONAL(39,"Marketing Professional"),
	MEDIAPROFESSIONAL(40,"Media Professional"),
	MERCHANTNAVY(41,"Merchant Navy"),
	NGOSOCIALSERVICES(42,"NGO/Social Services"),
	NURSE(43,"Nurse"),
	OFFICEADMIN(44,"Office Admin"),
	OPERATORTECHNICIAN(45,"Operator/Technician"),
	PHYSIOTHERAPIST(46,"Physiotherapist"),
	PILOT(47,"Pilot"),
	POLICE(48,"Police"),
	PRIVATESECURITY(49,"Private Security"),
	PRODUCTMANAGER(50,"Product manager"),
	PROFESSORLECTURER(51,"Professor/Lecturer"),
	PROGRAMMANAGER(52,"Program Manager"),
	PROJECTMANAGERIT(53,"Project Manager - IT"),
	PROJECTMANAGERNONI(54,"Project Manager - Non IT"),
	PSYCHOLOGIST(55,"Psychologist"),
	RESEARCHPROFESSIONAL(56,"Research Professional"),
	SALESPROFESSIONAL(57,"Sales Professional"),
	SCIENTIST(58,"Scientist"),
	SECRETARYFRONTOFFICE(59,"Secretary/Front Office"),
	SECURITYPROFESSIONAL(60,"Security Professional"),
	SELFEMPLOYED(61,"Self Employed"),
	SOFTWAREPROFESSIONAL(62,"Software Professional"),
	SPORTSPERSON(63,"Sportsperson"),
	STUDENT(64,"Student"),
	TEACHER(65,"Teacher"),
	TOPMANAGEMENT(66,"Top Management (CXO M.D. etc.)"),
	UIUXDESIGNER(67,"UI/UX designer"),
	WEBGRAPHIDESIGN(68,"Web/Graphic Design"),
	OTHERS(69,"Others");
	
	private int id;
	
	private String value;
	
	
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
	
	
	
	
}
