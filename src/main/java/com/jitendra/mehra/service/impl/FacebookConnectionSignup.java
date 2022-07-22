package com.jitendra.mehra.service.impl;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.repository.UserRepository;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {
	
	private final Logger logger = LoggerFactory.getLogger(FacebookConnectionSignup.class);
	
	
	 @Autowired
	 private UserRepository userRepository;

	@Override
	public String execute(Connection<?> connection) {
		logger.info("signup {} ",connection);
        final User user = new User();
        user.setUsername(connection.getDisplayName());
        user.setPassword(randomAlphabetic(8));
        userRepository.save(user);
        return user.getUsername();
	}

}
