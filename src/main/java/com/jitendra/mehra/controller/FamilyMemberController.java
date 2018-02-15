package com.jitendra.mehra.controller;

import java.io.File;
import java.io.IOException;
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.search.Age;
import com.jitendra.mehra.search.Height;
import com.jitendra.mehra.search.Income;
import com.jitendra.mehra.search.Search;
import com.jitendra.mehra.service.FamilyMemberService;

@RestController
@RequestMapping(path = "/member")
public class FamilyMemberController {
	
	private final Logger logger = LoggerFactory.getLogger(FamilyMemberController.class);
	
	@Autowired
	private FamilyMemberService familyMemberService;
	
	@RequestMapping(path="/{id}",method = RequestMethod.GET)
	public ResponseEntity<FamilyMember> getMemmderById(@PathVariable(name = "id" , required = true) Long id){
		logger.debug("getMemmderById : {}", id);
		return  new ResponseEntity<FamilyMember>( familyMemberService.getById(id),HttpStatus.OK);
	}
	
	@RequestMapping(path="/person/{id}",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getMemmderByPersonId(@PathVariable(name = "id" , required = true) Long id){
		logger.debug("getMemmderByPersonId : {}", id);
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getByPersonId(id),HttpStatus.OK);
	}
	
	@RequestMapping(path="/{name}",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getMemmderByName(@PathVariable(name = "name" , required = true) String name){
		logger.debug("getMemmderByName : {}", name);
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getByName(name),HttpStatus.OK);
	}
	
	@RequestMapping(path="/", method = RequestMethod.POST)
	public ResponseEntity<FamilyMember> add(@RequestBody FamilyMember familyMember ){
		logger.debug("add : {}", familyMember);
		return new ResponseEntity<FamilyMember>(  familyMemberService.save(familyMember),HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Search obj = new Search();
		obj.setAge(new Age("12", "25"));
		 obj.setQualifications(Arrays.asList(Qualification.G,Qualification.PG));
		 obj.setGotra("Gotra1,Gotra2,Gotra3");
		 obj.setBodyTypes(Arrays.asList(BodyType.AVERAGE));
		 obj.setCity("itarsi,indore");		 
		 obj.setComplexions(Arrays.asList(Complexion.DARK,Complexion.VERYFAIR,Complexion.WHEATISH_BROWN ));
		 obj.setIncome(new Income("120000", "250000"));
		 obj.setHeight(new Height("4.5", "5.1"));

		//Object to JSON in file
		try {
			mapper.writeValue(new File("d:\\file2.json"), obj);
			
			//Object to JSON in String
			String jsonInString = mapper.writeValueAsString(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
