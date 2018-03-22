package com.jitendra.mehra.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.savedrequest.NullRequestCache;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.mem.InMemoryUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;

import com.jitendra.mehra.filter.CrosFilter;
import com.jitendra.mehra.service.impl.FacebookConnectionSignup;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private ConnectionFactoryLocator connectionFactoryLocator;
 
    @Autowired
    private UsersConnectionRepository usersConnectionRepository;
 
    @Autowired
    private FacebookConnectionSignup facebookConnectionSignup;
    
    
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http .addFilterBefore(new CrosFilter(), ChannelProcessingFilter.class)
		.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
		.and().authorizeRequests()
		.antMatchers("/console/**").permitAll()
		.antMatchers("/register").permitAll()
		.antMatchers("/auth").permitAll()
		.antMatchers("/api-v1").permitAll()
		.antMatchers("/api/**").authenticated()
		.and().requestCache().requestCache(new NullRequestCache()) //
		.and().httpBasic() //
		.and().csrf().disable();
		
		http.headers().frameOptions().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
		 
		 
		
		 
	}

	@Autowired
	void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select username,password, enabled from users where username=?")
			.authoritiesByUsernameQuery("select username, role from user_roles where username=?");//
		 
	}
	
	@Bean
    public ProviderSignInController providerSignInController() {
        ((InMemoryUsersConnectionRepository) usersConnectionRepository)
          .setConnectionSignUp(facebookConnectionSignup);
         
        return new ProviderSignInController(
          connectionFactoryLocator, 
          usersConnectionRepository, 
          new FacebookSignInAdapter());
    }
	
	
}
