package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.search.Age;
import com.jitendra.mehra.search.Height;
import com.jitendra.mehra.search.Income;
import com.jitendra.mehra.search.Search;
import com.jitendra.mehra.service.PersonService;

@RestController
@RequestMapping(path="/api/person")
public class PersonEndpoint {
	
	private final Logger logger = LoggerFactory.getLogger(PersonEndpoint.class);
	
	@Autowired
	private PersonService personService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public Page<Person>  getAll(Pageable pageable){
		logger.info("getAll : {}");
		return  personService.get(pageable) ;
	}
	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<Person>  getById(@PathVariable(name="name") String id){
		logger.info("getById : {}", id);
		return  new ResponseEntity<Person>(  personService.getById(id),HttpStatus.OK);				
	}
	
	@Secured("ROLE_NEW")
	@RequestMapping(path = "/" , method = RequestMethod.POST)
	public ResponseEntity<Person> add(@AuthenticationPrincipal Principal user ,@RequestBody Person person ){	
		logger.info("add : {}", person);
		return new ResponseEntity<Person>(  personService.save(person),HttpStatus.OK);		
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public ResponseEntity<Page<Person>> search(@RequestBody Search search,Pageable pageable ){	
		logger.info("search : {}", search);
		List<Person> persons = personService.search(search);
		Page<Person> pages = new PageImpl<Person>(persons, pageable, persons.size());		 
		return new ResponseEntity<Page<Person>>( pages ,HttpStatus.OK);		
	}
	
	@RequestMapping(path = "/" , method = RequestMethod.PUT)
	public ResponseEntity<Person> update(@RequestBody Person person){
		logger.info("update :  person : {}", person);
		return new ResponseEntity< Person>( personService.update(person) ,HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable(name="id") String id){
		try {
			personService.delete(id);
			return new ResponseEntity< Boolean>( true ,HttpStatus.OK);
		} catch (IllegalArgumentException illegalArgumentException ) {
			return new ResponseEntity< Boolean>( false ,HttpStatus.OK);
		}
		
	}
	
	@Transactional
	@RequestMapping(path = "/Status/", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> hide(@AuthenticationPrincipal Principal user){
		int i = personService.temporyHide(user.getName(), PersonStatus.HIDE);
		return new ResponseEntity< Boolean>( i>0?true:false ,HttpStatus.OK);
		
	}
	
	
	@Transactional
	@RequestMapping(path = "/profilepic/", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> setProfilePic(@AuthenticationPrincipal Principal user,@RequestParam("picname") String name){
		int i = personService.setProfilePic( user.getName(), name);
		return new ResponseEntity< Boolean>( i>0?true:false ,HttpStatus.OK);		
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
