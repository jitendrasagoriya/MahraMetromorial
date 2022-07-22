package com.jitendra.mehra.builder;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.HabitDto;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.Drink;
import com.jitendra.mehra.enums.EatingHabit;
import com.jitendra.mehra.enums.Smoker;

public class HabitBuilder {
	
	private HabitDto habit;

	/**
	 * @param habit
	 */
	
	public HabitBuilder() {
		this.habit = new HabitDto();
	}
	
	public HabitBuilder(Profile profile) {
		 this.habit = new HabitDto();
		 this.habit.setDiet(profile.getPerson().getEatingHabit());
		 this.habit.setDrink(profile.getPerson().getDrink());
		 this.habit.setSmoke(profile.getPerson().getSomke());
	}
	
	
	public HabitBuilder(Person person) {
		 this.habit = new HabitDto();
		 this.habit.setDiet(person.getEatingHabit());
		 this.habit.setDrink(person.getDrink());
		 this.habit.setSmoke(person.getSomke());
	}
	
	public HabitBuilder withOpenToPets(Boolean obj) {
		this.habit.setOpenToPets(obj);
		return this;
	}
	
	public HabitBuilder withSmoke(Smoker obj) {
		this.habit.setSmoke(obj);
		return this;
	}
	
	public HabitBuilder withDrink(Drink obj) {
		this.habit.setDrink(obj);
		return this;
	}
	
	public HabitBuilder withDiet(EatingHabit obj) {
		this.habit.setDiet(obj);
		return this;
	}
	
	public HabitDto build() {
		return this.habit;
	}

}
