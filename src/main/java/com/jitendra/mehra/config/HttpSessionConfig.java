package com.jitendra.mehra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.ExpiringSession;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.SessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.web.http.HttpSessionStrategy;

@Configuration
@EnableSpringHttpSession
public class HttpSessionConfig {

	@Bean
	SessionRepository<ExpiringSession> inmemorySessionRepository() {
		return new MapSessionRepository();
	}

	@Bean
	HttpSessionStrategy httpSessionStrategy() {
		return new com.jitendra.mehra.config.HttpSessionStrategy();
	}
}
