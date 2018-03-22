package com.jitendra.mehra.utils;

import java.sql.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
public class DateUtility {
	
	public static Date decreaseYearsInCurrentDate(int years) {
		 	Calendar date = Calendar.getInstance();
		    date.setTime(new Date(System.currentTimeMillis()));
		    Format f = new SimpleDateFormat("yyyy-mm-dd");		    
		    date.add(Calendar.YEAR,-years);		    
		    return new Date(date.getTimeInMillis()) ;
	}
	
	public static Date paserStringToDate(String format, String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);//"dd-MMM-yyyy"
		 Date date = null;
	    try {
	    	date =  new Date( formatter.parse(dateInString).getTime() );	        
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return date; 
	}
	
	
	
}
