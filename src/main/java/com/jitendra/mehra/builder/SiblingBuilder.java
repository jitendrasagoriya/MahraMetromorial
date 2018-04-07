package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.dto.SiblingDto;

public class SiblingBuilder {
	
	private SiblingDto sibling;

	 
	public SiblingBuilder() {
		sibling = new SiblingDto();
	}
	
	
	public SiblingBuilder(Profile profile) {
		sibling = new SiblingDto();
		sibling.setMarriedBrothers(profile.getPerson().getNoOfMarriedBrother());
		sibling.setMarriedSister(profile.getPerson().getNoOfMarriedSisters());
		sibling.setNoOfBrothers(profile.getPerson().getNoOfBrother());
		sibling.setNoOfSister(profile.getPerson().getNoOfSisters());
	}
	
	public SiblingBuilder withNoOfSister(Integer obj) {
		this.sibling.setNoOfSister(obj);
		return this;
	}
	
	public SiblingBuilder withNoOfBrothers(Integer obj) {
		this.sibling.setNoOfBrothers(obj);
		return this;
	}
	public SiblingBuilder withMarriedBrothers(Integer obj) {
		this.sibling.setMarriedBrothers(obj);
		return this;
	}
	public SiblingBuilder withMarriedSister(Integer obj) {
		this.sibling.setMarriedSister(obj);
		return this;
	}

	public SiblingDto build() {
		return this.sibling;
	}
}
