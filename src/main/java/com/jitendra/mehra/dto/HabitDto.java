package com.jitendra.mehra.dto;

import com.jitendra.mehra.enums.Drink;
import com.jitendra.mehra.enums.EatingHabit;
import com.jitendra.mehra.enums.Smoker;

public class HabitDto {

	private EatingHabit diet ;
	private Smoker smoke;
	private Drink drink;
	private Boolean openToPets;
	/**
	 * @return the diet
	 */
	public EatingHabit getDiet() {
		return diet;
	}
	/**
	 * @param diet the diet to set
	 */
	public void setDiet(EatingHabit diet) {
		this.diet = diet;
	}
	/**
	 * @return the smoke
	 */
	public Smoker getSmoke() {
		return smoke;
	}
	/**
	 * @param smoke the smoke to set
	 */
	public void setSmoke(Smoker smoke) {
		this.smoke = smoke;
	}
	/**
	 * @return the drink
	 */
	public Drink getDrink() {
		return drink;
	}
	/**
	 * @param drink the drink to set
	 */
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	/**
	 * @return the openToPets
	 */
	public Boolean getOpenToPets() {
		return openToPets;
	}
	/**
	 * @param openToPets the openToPets to set
	 */
	public void setOpenToPets(Boolean openToPets) {
		this.openToPets = openToPets;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HabitDto [diet=" + diet + ", smoke=" + smoke + ", drink=" + drink + ", openToPets=" + openToPets + "]";
	}
	
	
}
