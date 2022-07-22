package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.FamilyDto;
import com.jitendra.mehra.dto.HabitDto;
import com.jitendra.mehra.dto.LifeStyleDto;
import com.jitendra.mehra.dto.Profile;

public class LifeStyleBuilder {
	
	private LifeStyleDto lifeStyle;

	public LifeStyleBuilder() {
		lifeStyle = new LifeStyleDto();
	}
	
	public LifeStyleBuilder(Person person) {
		lifeStyle = new LifeStyleDto();
		lifeStyle.setFoodAndCook(person.getFoodAndCook());
		lifeStyle.setHabit(new HabitBuilder(person).build());
		lifeStyle.setHobbies(person.getAboutFamily());
		lifeStyle.setInterest( person.getInterest());		
	}
	 

	
	public LifeStyleBuilder(Profile profile) {
		Person person = profile.getPerson();
		lifeStyle = new LifeStyleDto();
		lifeStyle.setFoodAndCook(person.getFoodAndCook());
		lifeStyle.setHabit(new HabitBuilder(person).build());
		lifeStyle.setHobbies(person.getAboutFamily());
		lifeStyle.setInterest( person.getInterest());			
	}
	
	public LifeStyleBuilder withInterest(String obj) {
		this.lifeStyle.setInterest(obj);
		return this;
	}
	
	public LifeStyleBuilder withHobbies(String obj) {
		this.lifeStyle.setHobbies(obj);
		return this;
	}
	
	public LifeStyleBuilder withHabit(HabitDto obj) {
		this.lifeStyle.setHabit(obj);
		return this;
	}
	
	public LifeStyleBuilder withFoodAndCook(String obj) {
		this.lifeStyle.setFoodAndCook(obj);
		return this;
	}
	
	public LifeStyleDto build() {
		return this.lifeStyle;
	}

}
