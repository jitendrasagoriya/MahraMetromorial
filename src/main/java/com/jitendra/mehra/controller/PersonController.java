package com.jitendra.mehra.controller;

import java.sql.Timestamp;
import java.util.Arrays;
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
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.search.Age;
import com.jitendra.mehra.search.Height;
import com.jitendra.mehra.search.Income;
import com.jitendra.mehra.search.Search;
import com.jitendra.mehra.service.PersonService;

@RestController
@RequestMapping(path="/person")
public class PersonController {
	
	private final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Person>>  getAll(){
		logger.info("getAll : {}");
		return new ResponseEntity<List<Person>>(personService.get(), HttpStatus.OK)  ;
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person>  getById(@PathVariable(name="id") long id){
		logger.info("getById : {}", id);
		return  new ResponseEntity<Person>(  personService.getById(id),HttpStatus.OK);				
	}
	
	@RequestMapping(path = "/" , method = RequestMethod.POST)
	public ResponseEntity<Person> add(@RequestBody Person person ){	
		logger.info("add : {}", person);
		return new ResponseEntity<Person>(  personService.save(person),HttpStatus.OK);		
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public ResponseEntity<List<Person>> search(@RequestBody Search search ){	
		logger.info("search : {}", search);
		return new ResponseEntity<List<Person>>(  personService.search(search),HttpStatus.OK);		
	}

	
	public static void main(String[] args) {
		System.out.println( new Timestamp(System.currentTimeMillis()));
		
		Search obj = new Search();
		obj.setAge(new Age("12", "25"));
		 obj.setQualifications(Arrays.asList(Qualification.G,Qualification.PG));
		 obj.setGotra("Gotra1,Gotra2,Gotra3");
		 obj.setBodyTypes(Arrays.asList(BodyType.AVERAGE));
		 obj.setCity("itarsi,indore");		 
		 obj.setComplexions(Arrays.asList(Complexion.DARK,Complexion.VERYFAIR,Complexion.WHEATISH_BROWN ));
		 obj.setIncome(new Income("120000", "250000"));
		 obj.setHeight(new Height("4.5", "5.1"));
		
	}
}
