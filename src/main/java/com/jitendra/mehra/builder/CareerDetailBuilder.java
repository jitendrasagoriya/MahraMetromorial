package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.CareerDetailDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.Occupation;

public class CareerDetailBuilder {
	
	private CareerDetailDto careerDetail;

	
	public CareerDetailBuilder() {
		careerDetail = new CareerDetailDto();
	}
	
	public CareerDetailBuilder(Profile profile) {	
		careerDetail = new CareerDetailDto();
		careerDetail.setDesignation(profile.getPerson().getDesgination());
		careerDetail.setExperience(0);
		careerDetail.setIncome(profile.getPerson().getIncome());
		careerDetail.setOccupation(profile.getPerson().getOccupation() );
	}
	
	public CareerDetailBuilder withDesignation(String designation) {
		this.careerDetail.setDesignation(designation);
		return this;
	}
	
	
	public CareerDetailBuilder withExperience(Integer experience) {
		this.careerDetail.setExperience(experience);
		return this;
	}
	
	
	public CareerDetailBuilder withIncome(Float income) {
		this.careerDetail.setIncome(income);
		return this;
	}
	
	public CareerDetailBuilder withOccupation(Occupation occupation) {
		this.careerDetail.setOccupation(occupation);
		return this;
	}
	
	
	public CareerDetailDto build() {
		return this.careerDetail;
	}

}
