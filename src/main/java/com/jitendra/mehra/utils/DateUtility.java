package com.jitendra.mehra.utils;

import java.sql.Date;
import java.text.Format;
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
	
	
}
