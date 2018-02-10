package com.jitendra.mehra.controller;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.service.PersonService;

@RestController
@RequestMapping(path="/person")
public class PersonController {
	
	private final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Person>>  getAll(){
		logger.debug("getAll : {}");
		return new ResponseEntity<List<Person>>(personService.get(), HttpStatus.OK)  ;
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person>  getById(@PathVariable(name="id") long id){
		logger.debug("getById : {}", id);
		return  new ResponseEntity<Person>(  personService.getById(id),HttpStatus.OK);				
	}
	
	@RequestMapping(path = "/" , method = RequestMethod.POST)
	public ResponseEntity<Person> add(@RequestBody Person person ){	
		logger.debug("add : {}", person);
		return new ResponseEntity<Person>(  personService.save(person),HttpStatus.OK);		
	}

	
	public static void main(String[] args) {
		System.out.println( new Timestamp(System.currentTimeMillis()));
		
	}
}
