package com.jitendra.mehra.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ExceptionHandlingControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	   public ResponseEntity<String> handleExecutionRestrictionViolationException(Exception ex) {
	     return response("Internal Server Error", ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	   }

	   private static String createJson(String message, String reason) {
	    return "{\"error\" : \"" + message + "\"," +
	            "\"reason\" : \"" + reason  + "\"}";
	   }

	   private static ResponseEntity<String> response(String message,
	                                               String reason,
	                                               HttpStatus httpStatus) {
	    String json = createJson(message, reason);
	    return new ResponseEntity<>(json, httpStatus);
	   }
}
