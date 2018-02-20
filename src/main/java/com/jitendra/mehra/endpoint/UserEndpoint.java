package com.jitendra.mehra.endpoint;

import java.io.File;
import java.io.IOException;

import org.h2.jdbc.JdbcSQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitendra.mehra.domin.User;
import com.jitendra.mehra.domin.UserAlreadyExistsException;
import com.jitendra.mehra.service.UserService;

@RestController
public class UserEndpoint {
	
	private final Logger logger = LoggerFactory.getLogger(PersonEndpoint.class);
	
	@Autowired
	private UserService userService;
	
	 
	@RequestMapping(path = "/api/user/", method = RequestMethod.GET)
	public Page<User>  getAll(Pageable pageable){
		logger.info("getAll : {}");
		return  userService.get(pageable) ;
	}
	
	@RequestMapping(path = "/api/user/{name}", method = RequestMethod.GET)
	public User  get(@PathVariable(name="name") String name){
		logger.info("get : {}",name);
		return  userService.getByUserName(name);
	}	
	 
	@RequestMapping(path = "/register" , method = RequestMethod.POST,produces="application/json")
	public ResponseEntity<?> add(@RequestBody User user ) {	
		logger.info("add : {}", user);
		try {
			return new ResponseEntity<User>(  userService.register(user,null),HttpStatus.OK);
		}catch (UserAlreadyExistsException | JdbcSQLException e) {
			return new ResponseEntity<String>(  "User is rlready registered",HttpStatus.OK);
		}
	}	

}
