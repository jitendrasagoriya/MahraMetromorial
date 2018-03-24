package com.jitendra.mehra.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitendra.mehra.dto.MultiPropertyRequest;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;

public class JSONUtility {
	
	
	public static String convertObjectToJSON(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";
		
		//Object to JSON in file
		try {
			
			 jsonInString = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			 e.printStackTrace();
		} catch (JsonMappingException e) {
			 e.printStackTrace();
		} catch (IOException e) {
			 e.printStackTrace();
		}
		return  jsonInString;
		
	}
	
	
	public static Map<String, Object> jsonToMap(String jsonString){
		Map<String, Object> map = new HashMap<String, Object>();

		try {

			ObjectMapper mapper = new ObjectMapper();		
			// convert JSON string to Map
			map = mapper.readValue(jsonString, new TypeReference<Map<String, String>>(){});			  

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	
	}
	
	public static String jsonToMap(Map<String, Object> map){
		String json = ""; 
		try {

			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);		 

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;
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
