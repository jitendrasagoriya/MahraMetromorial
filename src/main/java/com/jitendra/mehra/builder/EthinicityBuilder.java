package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.EthinicityDto;
import com.jitendra.mehra.dto.Profile;

public class EthinicityBuilder {
	
	private EthinicityDto ethinicity;

	 
	public EthinicityBuilder() {
		ethinicity = new EthinicityDto();
	}
	
	public EthinicityBuilder(Profile profile) {
		ethinicity = new EthinicityDto();
		ethinicity.setCaste(profile.getPerson().getCast());
		//ethinicity.setEthinicity(ethinicity);
		ethinicity.setGotra(profile.getPerson().getGotra());
		ethinicity.setGotraToSave(profile.getPerson().getGotraToSave());
		ethinicity.setMotherToung("HINDI");
		ethinicity.setReligion(profile.getPerson().getReligion());
	}
	
	
	public EthinicityBuilder(Person person) {
		ethinicity = new EthinicityDto();
		ethinicity.setCaste(person.getCast());
		//ethinicity.setEthinicity(ethinicity);
		ethinicity.setGotra(person.getGotra());
		ethinicity.setGotraToSave(person.getGotraToSave());
		ethinicity.setMotherToung("HINDI");
		ethinicity.setReligion(person.getReligion());
	}
	
	public EthinicityBuilder withGotra(String obj) {
		this.ethinicity.setGotra(obj);
		return this;
	}
	
	
	public EthinicityBuilder withGotraToSave(String obj) {
		this.ethinicity.setGotraToSave(obj);
		return this;
	}
	
	public EthinicityBuilder withMotherToung(String obj) {
		this.ethinicity.setMotherToung(obj);
		return this;
	}
	
	public EthinicityBuilder withReligion(String obj) {
		this.ethinicity.setReligion(obj);
		return this;
	}
	
	public EthinicityBuilder withCaste(String obj) {
		this.ethinicity.setCaste(obj);
		return this;
	}

	
	public EthinicityDto build() {
		return this.ethinicity;
	}
	
}
