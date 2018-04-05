package com.jitendra.mehra.dto;

public class LifeStyleDto {
	
	private String foodAndCook;
	private HabitDto habit ;
	private AssetsDto assets ;
	private String hobbies;
	private String interest;
	/**
	 * @return the foodAndCook
	 */
	public String getFoodAndCook() {
		return foodAndCook;
	}
	/**
	 * @param foodAndCook the foodAndCook to set
	 */
	public void setFoodAndCook(String foodAndCook) {
		this.foodAndCook = foodAndCook;
	}
	/**
	 * @return the habit
	 */
	public HabitDto getHabit() {
		return habit;
	}
	/**
	 * @param habit the habit to set
	 */
	public void setHabit(HabitDto habit) {
		this.habit = habit;
	}
	/**
	 * @return the assets
	 */
	public AssetsDto getAssets() {
		return assets;
	}
	/**
	 * @param assets the assets to set
	 */
	public void setAssets(AssetsDto assets) {
		this.assets = assets;
	}
	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}
	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LifeStyleDto [foodAndCook=" + foodAndCook + ", habit=" + habit + ", assets=" + assets + ", hobbies="
				+ hobbies + ", interest=" + interest + "]";
	}

	
}
