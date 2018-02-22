package com.jitendra.mehra.utils;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
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
		Request request = new Request();	
		RequestAndLikeIdenntity idenntity = new RequestAndLikeIdenntity();
		idenntity.setId("jitendrasagoriy");
		idenntity.setSecoundryId("shalu");
		request.setId(idenntity);
		request.setRequestDate(new Timestamp(System.currentTimeMillis()));
		request.setRequestStatus(RequestStatus.SEND);
		
		System.out.println( convertObjectToJSON(request) );
	}

}
