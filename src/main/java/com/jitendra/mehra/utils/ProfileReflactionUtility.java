package com.jitendra.mehra.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Challenged;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Drink;
import com.jitendra.mehra.enums.EatingHabit;
import com.jitendra.mehra.enums.Gender;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.MotherOccupation;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.enums.Relation;
import com.jitendra.mehra.enums.Smoker;

public class ProfileReflactionUtility {
	
	private final Logger logger = LoggerFactory.getLogger(ProfileReflactionUtility.class);
	String fmt = "{}:  {} = {}";
	
	public Profile updatePersonByRelflaction(Profile profile,String attributeName,String attributeValue) {
		logger.info("person : {}",profile);
		
		Person person = profile.getPerson();
		logger.info("Person name : {}",person.getfName() );
		try {
			Class<?> c = person.getClass();
			Field field = c.getDeclaredField(attributeName);			 
			field.setAccessible(true);			
			//System.out.println( field.getType() );
			if( field.getType().getSimpleName().equalsIgnoreCase("string") ) {
				//logger.info(fmt, "before", field.getName(), field.get(field.));
				field.set(person, attributeValue);
				//logger.info(fmt, "after", field.getName(), field.get(field));
			} else if( field.getType().getSimpleName().equals( "BodyType") ) {
				logger.info(fmt, "before", field.getName(), person.getBodyType() );
				field.set(person, BodyType.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getBodyType() );
			}  else if( field.getType().getSimpleName().equals( "long") ) {
				logger.info(fmt, "before", field.getName(), field.get(field.getName()) );
				field.setLong(person, Long.parseLong(attributeValue));
				logger.info(fmt, "after", field.getName(),  field.get(field.getName()));
			} else if( field.getType().getSimpleName().equals( "Gender") ) {
				logger.info(fmt, "before", field.getName(), person.getGender() );
				field.set(person, Gender.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getGender() );
			}  else if( field.getType().getSimpleName().equals( "Date") ) {
				logger.info(fmt, "before", field.getName(), person.getDob()  );
				field.set( person, DateUtility.paserStringToDate("yyyy-mm-dd", attributeValue) );
				logger.info(fmt, "after", field.getName(), person.getDob() );
			} else if( field.getType().getSimpleName().equals( "Qualification") ) {
				logger.info(fmt, "before", field.getName(), person.getQualification() );
				field.set(person, Qualification.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getQualification() );
			} else if( field.getType().getSimpleName().equalsIgnoreCase( "Integer") ) {				 
				field.set(person, Integer.parseInt( attributeValue));				 
			}else if( field.getType().getSimpleName().equalsIgnoreCase( "int") ) {				 
				field.set(person, Integer.parseInt( attributeValue));				 
			}else if( field.getType().getSimpleName().equals( "Complexion") ) {
				logger.info(fmt, "before", field.getName(), person.getComplexion() );
				field.set(person, Complexion.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getComplexion() );
			} else if( field.getType().getSimpleName().equals( "Challenged") ) {
				logger.info(fmt, "before", field.getName(), person.getChallenged() );
				field.set(person, Challenged.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getChallenged() );
			} else if( field.getType().getSimpleName().equals( "PersonStatus") ) {
				logger.info(fmt, "before", field.getName(), person.getPersonStatus() );
				field.set(person, PersonStatus.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getPersonStatus() );
			} else if( field.getType().getSimpleName().equals( "MaritalStatus") ) {
				logger.info(fmt, "before", field.getName(), person.getMaritalStatus() );
				field.set(person, MaritalStatus.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getMaritalStatus() );
			} else if( field.getType().getSimpleName().equals( "Smoker") ) {
				logger.info(fmt, "before", field.getName(), person.getSomke() );
				field.set(person, Smoker.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getSomke() );
			} else if( field.getType().getSimpleName().equals( "Drink") ) {
				logger.info(fmt, "before", field.getName(), person.getDrink() );
				field.set(person, Drink.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getDrink() );
			} else if( field.getType().getSimpleName().equals( "Boolean") ) {
				 
				field.set( person, Boolean.parseBoolean( attributeValue));
				 
			} else if( field.getType().getSimpleName().equals( "EatingHabit") ) {
				logger.info(fmt, "before", field.getName(), person.getEatingHabit() );
				field.set(person, EatingHabit.getByValue(attributeValue));
				logger.info(fmt, "after", field.getName(), person.getEatingHabit() );
			}
			
		} catch (NoSuchFieldException x) {
		    x.printStackTrace();
		} catch (IllegalAccessException x) {
		    x.printStackTrace();
		}
		//profile.setPerson(person);		
		
		return profile;
		
	}
	
	
	public Profile updateFamilyMemberByRelflaction(Profile profile,String attributeName,String attributeValue) {
		
		for (FamilyMember familyMember : profile.getFamilyMembers()) {
			if(familyMember.getIsEdit()) {
				try {
					Class<?> c = familyMember.getClass();
					Field field = c.getDeclaredField(attributeName);			 
					field.setAccessible(true);
					
					if( field.getType().getSimpleName().equalsIgnoreCase("string") ) {
						//logger.info(fmt, "before", field.getName(), field.get(field.));
						field.set(familyMember, attributeValue);
						//logger.info(fmt, "after", field.getName(), field.get(field));
					} else if( field.getType().getSimpleName().equals( "Relation") ) {
						logger.info(fmt, "before", field.getName(), familyMember.getRelation() );
						field.set(familyMember, Relation.getByValue(attributeValue));
						logger.info(fmt, "after", field.getName(), familyMember.getRelation() );
					}  else if( field.getType().getSimpleName().equals( "long") ) {
						logger.info(fmt, "before", field.getName(), field.get(field.getName()) );
						field.setLong(familyMember, Long.parseLong(attributeValue));
						logger.info(fmt, "after", field.getName(),  field.get(field.getName()));
					}  else if( field.getType().getSimpleName().equals( "Date") ) {
						logger.info(fmt, "before", field.getName(), familyMember.getDob()  );
						field.set( familyMember, DateUtility.paserStringToDate("yyyy-mm-dd", attributeValue) );
						logger.info(fmt, "after", field.getName(), familyMember.getDob() );
					} else if( field.getType().getSimpleName().equals( "MotherOccupation") ) {
						logger.info(fmt, "before", field.getName(), familyMember.getOccupation() );
						field.set(familyMember, MotherOccupation.getByValue(attributeValue));
						logger.info(fmt, "after", field.getName(), familyMember.getOccupation() );
					}
					
				} catch (NoSuchFieldException x) {
				    x.printStackTrace();
				} catch (IllegalAccessException x) {
				    x.printStackTrace();
				}				
			}
		}
		
		return profile;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Profile profile = new Profile();
		Person person = new Person();
		person.setCast("cast1");
		person.setBodyType(BodyType.ATHLETIC);
		person.setDoingJob(false);
		profile.setPerson(person);
		
		
		
		new ProfileReflactionUtility().updatePersonByRelflaction(profile, "dob", "1942-02-02") ;
		//System.out.println( profile.getPerson().getDob());
		new ProfileReflactionUtility().updatePersonByRelflaction(profile, "fName", "jitendra") ;
		
		new ProfileReflactionUtility().updatePersonByRelflaction(profile, "lName", "Sagoriya") ;
		
		 
		
		FamilyMember familyMember  = new FamilyMember();
		familyMember.setIsEdit(Boolean.TRUE);
		familyMember.setId( 1l);
		
		FamilyMember familyMember2  = new FamilyMember();
		familyMember2.setIsEdit(Boolean.FALSE);
		familyMember2.setId( 2l);
		
		profile.setFamilyMembers(new HashSet<>(  Arrays.asList(familyMember,familyMember2)));
		
		System.out.println("Before reflaction....");
		for (FamilyMember member : profile.getFamilyMembers()) {
			if(member.getIsEdit()) {
				System.out.println("Editable profile....");
				System.out.println(member.getDob());
				System.out.println(member.getGotra());
				System.out.println(member.getOccupation());
				System.out.println(member.getRelation());
			} else {
				System.out.println("Non Editable profile....");
				System.out.println(member.getDob());
				System.out.println(member.getGotra());
				System.out.println(member.getOccupation());
				System.out.println(member.getRelation());
			}
		}
		
		new ProfileReflactionUtility().updateFamilyMemberByRelflaction( profile, "dob", "1947-02-02") ;
		new ProfileReflactionUtility().updateFamilyMemberByRelflaction( profile, "gotra", "No Gotra") ;
		new ProfileReflactionUtility().updateFamilyMemberByRelflaction( profile, "occupation", "Housewife") ;
		new ProfileReflactionUtility().updateFamilyMemberByRelflaction( profile, "relation", "SISTER") ;
		System.out.println("After reflaction....");
		for (FamilyMember member : profile.getFamilyMembers()) {
			if(member.getIsEdit()) {
				System.out.println("Editable profile....");
				System.out.println(member.getDob());
				System.out.println(member.getGotra());
				System.out.println(member.getOccupation());
				System.out.println(member.getRelation());
			} else {
				System.out.println("Non Editable profile....");
				System.out.println(member.getDob());
				System.out.println(member.getGotra());
				System.out.println(member.getOccupation());
				System.out.println(member.getRelation());
			}
		}
			
	}

}
