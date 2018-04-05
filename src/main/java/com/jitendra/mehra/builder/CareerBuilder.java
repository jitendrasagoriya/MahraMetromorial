package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.BasicDetailDto;
import com.jitendra.mehra.dto.CareerDetailDto;
import com.jitendra.mehra.dto.CareerDto;
import com.jitendra.mehra.dto.Profile;

public class CareerBuilder {
	
	private CareerDto career;

	/**
	 * 
	 */
	public CareerBuilder(Profile profile) {
		career = new CareerDto();
		career.setAbout(profile.getPerson().getAboutJob());
		career.setCareerDetail( new CareerDetailBuilder(profile).build());
	}
	
	public CareerBuilder( ) {
		career = new CareerDto();
		career.setCareerDetail( new CareerDetailBuilder().build());
	}
	
	public CareerBuilder withWeight(String about) {
		this.career.setAbout(about);
		return this;
	}
	
	public CareerBuilder withWeight(CareerDetailDto careerDetail) {
		this.career.setCareerDetail(careerDetail);
		return this;
	}
	
	public CareerDto build() {
		return this.career;
	}

}
