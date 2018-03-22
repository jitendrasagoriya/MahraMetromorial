package com.jitendra.mehra.config;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.session.events.SessionCreatedEvent;
import org.springframework.session.events.SessionDestroyedEvent;
import org.springframework.stereotype.Component;

@Component
public class SessionCreatedListenerService implements ApplicationListener<ApplicationEvent> {

	private static final Logger logger = LoggerFactory
	        .getLogger(SessionCreatedListenerService.class);

	@Autowired
	HttpSession httpSession;
	
	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
	     if(applicationEvent instanceof SessionDestroyedEvent){ //If event is a session destroy event	         
	         logger.debug(" Session is destory  :" ); //log dat
	     }else if(applicationEvent instanceof SessionCreatedEvent){ //If event is a session destroy event
	         logger.debug("  SessionCreatedEvent  :" ); //log data
	     }   
	}   
}
