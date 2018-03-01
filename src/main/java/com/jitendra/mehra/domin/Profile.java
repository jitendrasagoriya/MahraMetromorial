package com.jitendra.mehra.domin;

import java.util.Set;

public class Profile {

	private User user;
	
	private Person person;
	
	private Set<FamilyMember> familyMembers;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the familyMembers
	 */
	public Set<FamilyMember> getFamilyMembers() {
		return familyMembers;
	}

	/**
	 * @param familyMembers the familyMembers to set
	 */
	public void setFamilyMembers(Set<FamilyMember> familyMembers) {
		this.familyMembers = familyMembers;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((familyMembers == null) ? 0 : familyMembers.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profile other = (Profile) obj;
		if (familyMembers == null) {
			if (other.familyMembers != null)
				return false;
		} else if (!familyMembers.equals(other.familyMembers))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [user=" + user + ", person=" + person + ", familyMembers=" + familyMembers + "]";
	}
	
	
}
