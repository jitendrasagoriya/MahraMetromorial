package com.jitendra.mehra.enums;

public enum Challenged {

	NONE(0,"NONE","NONE"),
	PHB(1,"PHB","Physically Handicapped from birth"),
	PHA(1,"PHA","Physically Handicapped due to accident"),
	MCB(1,"MCB","Mentally Challenged from birth"),
	MCA(1,"MCA","Mentally Challenged due to accident");
	
	
	private int id;
	
	private String value;
	
	private String desc;

	/**
	 * @param id
	 * @param value
	 * @param desc
	 */
	private Challenged(int id, String value, String desc) {
		this.id = id;
		this.value = value;
		this.desc = desc;
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
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	
	
	
}
