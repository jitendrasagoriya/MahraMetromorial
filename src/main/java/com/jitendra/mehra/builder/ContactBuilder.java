package com.jitendra.mehra.builder;

import com.jitendra.mehra.dto.ContactDto;
import com.jitendra.mehra.dto.Profile;

public class ContactBuilder {
	
	private ContactDto contact;

	 
	public ContactBuilder() {
		contact = new ContactDto();
	}
	
	
	public ContactBuilder(Profile profile) {
		contact = new ContactDto();
		contact.setEmail(profile.getPerson().getEmail());
		contact.setLandline(profile.getPerson().getSecoundryContactNo());
		contact.setMobileNumber(profile.getPerson().getPrimeryContactNo());
		contact.setMobileNumber2(profile.getPerson().getSecoundryContactNo());
	}
	
	public ContactBuilder withEmail(String obj) {
		this.contact.setEmail(obj);
		return this;
	}
	
	public ContactBuilder withLandline(String obj) {
		this.contact.setLandline(obj);
		return this;
	}
	
	public ContactBuilder withMobileNumber(String obj) {
		this.contact.setMobileNumber(obj);
		return this;
	}
	
	public ContactBuilder withMobileNumber2(String obj) {
		this.contact.setMobileNumber2(obj);
		return this;
	}
	
	public ContactDto build() {
		return this.contact;
	}
	
	
}
