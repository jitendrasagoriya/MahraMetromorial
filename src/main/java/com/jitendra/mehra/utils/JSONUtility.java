package com.jitendra.mehra.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.enums.RequestStatus;

public class JSONUtility {
	
	
	public static String convertObjectToJSON(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";
		
		//Object to JSON in file
		try {
			
			 jsonInString = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  jsonInString;
		
	}
	
	public static void main(String[] args) {
		List<ProfileUpdateRequestObject> request = new ArrayList<>();
		ProfileUpdateRequestObject object = new ProfileUpdateRequestObject();
		object.setPropertyName("complexion");
		object.setPropertyValue( "FAIR");
		request.add(object);
		
		object = new ProfileUpdateRequestObject();
		object.setPropertyName("weight");
		object.setPropertyValue( "32");
		request.add(object);
		
		object = new ProfileUpdateRequestObject();
		object.setPropertyName("somke");
		object.setPropertyValue( "NO");
		request.add(object);
		
		MultiPropertyRequest multiPropertyRequest = new MultiPropertyRequest();
		multiPropertyRequest.setList(request);
		
		System.out.println( convertObjectToJSON(multiPropertyRequest) );
	}

}
