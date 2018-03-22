package com.jitendra.mehra.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.Session;
import org.springframework.stereotype.Component;

import com.jitendra.mehra.dto.Profile;
import com.jitendra.mehra.service.ProfileService;

@Component
public class HttpSessionStrategy implements org.springframework.session.web.http.HttpSessionStrategy {
	
	private final Logger logger = LoggerFactory.getLogger(HttpSessionStrategy.class);
	private String headerName = "x-auth-token";

	@Autowired
	private ProfileService profileService;
	
	@Override
	public String getRequestedSessionId(HttpServletRequest request) {
		return request.getHeader(this.headerName);
	}

	@Override
	public void onNewSession(Session session, HttpServletRequest request, HttpServletResponse response) {
		logger.info("onNewSession");
		response.setHeader(this.headerName, session.getId());
	}

	@Override
	public void onInvalidateSession(HttpServletRequest request, HttpServletResponse response) {
		logger.info("onInvalidateSession");		
		logger.info("Session Destroyed Start." );
		if(request.getSession().getAttribute("profile") != null) {
			logger.info("Updating profile start..");
			Profile profile = profileService.save((Profile)request.getSession().getAttribute("profile"));			 
			logger.info("Updating profile completed..");
		}
		logger.info("Session Destroyed End." );
		response.setHeader(this.headerName, "");
	}

 

}
