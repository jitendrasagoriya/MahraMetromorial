package com.jitendra.mehra.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.savedrequest.NullRequestCache;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
		.and().authorizeRequests()
		.antMatchers("/console/**").permitAll()
		.antMatchers("/api/**").authenticated()
		.and().requestCache().requestCache(new NullRequestCache()) //
		.and().httpBasic() //
		.and().csrf().disable();
		
		http.headers().frameOptions().disable();		
		 
	}

	@Autowired
	void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication() //
				.withUser("user").password("password").authorities("ROLE_USER") //
				.and() //
				.withUser("admin").password("password").authorities("ROLE_USER", "ROLE_ADMIN");
	}

}
