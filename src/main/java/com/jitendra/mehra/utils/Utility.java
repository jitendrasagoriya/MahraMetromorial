package com.jitendra.mehra.utils;

import java.sql.Date;

import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Challenged;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Drink;
import com.jitendra.mehra.enums.EatingHabit;
import com.jitendra.mehra.enums.Gender;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.Occupation;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.enums.Smoker;

public class Utility {
	
	public static Object getEmumIdByValue(String propertyName, String propertyValue) {
		
		if( propertyName.equalsIgnoreCase( "BodyType") ) {				 
			return BodyType.getByValue(propertyValue) ;				 
		}   else if( propertyName.equalsIgnoreCase( "Gender") ) {
			return Gender.getByValue( propertyValue) ;
		}   else if( propertyName.equalsIgnoreCase( "Qualification") ) {
			return  Qualification.getByValue(propertyValue) ;
		}  else if( propertyName.equalsIgnoreCase( "Complexion") ) {
			return Complexion.getByValue( propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "Challenged") ) {
			return Challenged.getByValue(propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "PersonStatus") ) {
			return PersonStatus.getByValue( propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "MaritalStatus") ) {
			return MaritalStatus.getByValue(propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "Smoker") ) {
			return Smoker.getByValue(propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "Drink") ) {
			return Drink.getByValue( propertyValue) ;
		}  else if( propertyName.equalsIgnoreCase( "EatingHabit") ) {
			return EatingHabit.getByValue(propertyValue) ;
		} else if( propertyName.equalsIgnoreCase( "Occupation") ) {
			return Occupation.getByValue(propertyValue) ;
		}	
		
		return null;
	}
	
	
	public static Object getRawTypeValue(String propertyType, String propertyValue ) {
		
		if( propertyType.equalsIgnoreCase("string") ) {
			return propertyValue;
		}   else if( propertyType.equalsIgnoreCase( "long")  ) {
			return Long.parseLong(  propertyValue );
		}  else if( propertyType.equals( "Date") ) {
			return Date.parse(propertyValue);
		}  else if( propertyType.equalsIgnoreCase( "Integer") ) {				 
			return Integer.parseInt( propertyValue);				 
		} else if( propertyType.equalsIgnoreCase( "int") ) {				 
			return Integer.parseInt( propertyValue);				 
		}  else if( propertyType.equals( "Boolean") ) {				 
			return Boolean.parseBoolean(propertyValue) ;				 
		}
		
		return null;
	}

}
