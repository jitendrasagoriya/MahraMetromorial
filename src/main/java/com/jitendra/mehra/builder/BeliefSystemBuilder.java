package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.BeliefSystemDto;
import com.jitendra.mehra.dto.Profile;

public class BeliefSystemBuilder {
	
	private BeliefSystemDto beliefSystem;

	/**
	 * 
	 */
	public BeliefSystemBuilder() {
		beliefSystem = new BeliefSystemDto();
	}
	
	public BeliefSystemBuilder(Profile profile) {
		beliefSystem = new BeliefSystemDto();
		 
	}

}
