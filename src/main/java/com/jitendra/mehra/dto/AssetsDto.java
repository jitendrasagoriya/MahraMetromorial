package com.jitendra.mehra.dto;

public class AssetsDto {
	private Boolean ownsHouse;
	private Boolean ownsCar;
	private Boolean ownsLand;
	private Boolean ownsShop;
	/**
	 * @return the ownsHouse
	 */
	public Boolean getOwnsHouse() {
		return ownsHouse;
	}
	/**
	 * @param ownsHouse the ownsHouse to set
	 */
	public void setOwnsHouse(Boolean ownsHouse) {
		this.ownsHouse = ownsHouse;
	}
	/**
	 * @return the ownsCar
	 */
	public Boolean getOwnsCar() {
		return ownsCar;
	}
	/**
	 * @param ownsCar the ownsCar to set
	 */
	public void setOwnsCar(Boolean ownsCar) {
		this.ownsCar = ownsCar;
	}
	/**
	 * @return the ownsLand
	 */
	public Boolean getOwnsLand() {
		return ownsLand;
	}
	/**
	 * @param ownsLand the ownsLand to set
	 */
	public void setOwnsLand(Boolean ownsLand) {
		this.ownsLand = ownsLand;
	}
	/**
	 * @return the ownsShop
	 */
	public Boolean getOwnsShop() {
		return ownsShop;
	}
	/**
	 * @param ownsShop the ownsShop to set
	 */
	public void setOwnsShop(Boolean ownsShop) {
		this.ownsShop = ownsShop;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssetsDto [ownsHouse=" + ownsHouse + ", ownsCar=" + ownsCar + ", ownsLand=" + ownsLand + ", ownsShop="
				+ ownsShop + "]";
	}
	
	

}
