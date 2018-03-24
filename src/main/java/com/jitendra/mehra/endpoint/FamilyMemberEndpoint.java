package com.jitendra.mehra.endpoint;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
@RequestMapping(path = "/api/member")
public class FamilyMemberEndpoint {
	
	private final Logger logger = LoggerFactory.getLogger(FamilyMemberEndpoint.class);
	
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
	
	@RequestMapping(path="/person/{name}",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getMemmderByName(@PathVariable(name = "name" , required = true) String name){
		logger.debug("getMemmderByName : {}", name);
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getByName(name),HttpStatus.OK);
	}
	
	@RequestMapping(path="/", method = RequestMethod.POST)
	public ResponseEntity<FamilyMember> add(@RequestBody FamilyMember familyMember ){
		logger.debug("add : {}", familyMember);
		return new ResponseEntity<FamilyMember>(  familyMemberService.save(familyMember),HttpStatus.OK);
	}
	
	@RequestMapping(path="/father",method = RequestMethod.GET)
	public ResponseEntity<FamilyMember> getFather( @AuthenticationPrincipal Principal user){
		logger.debug("getFather : {}", user.getName());
		return  new ResponseEntity<FamilyMember>( familyMemberService.getFather(user.getName()),HttpStatus.OK);
	}
	
	
	@RequestMapping(path="/mother",method = RequestMethod.GET)
	public ResponseEntity<FamilyMember> getMother( @AuthenticationPrincipal Principal user){
		logger.debug("getMother : {}", user.getName());
		return  new ResponseEntity<FamilyMember>( familyMemberService.getFather(user.getName()),HttpStatus.OK);
	}


	@RequestMapping(path="/sibilings",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getSibiling( @AuthenticationPrincipal Principal user){
		logger.debug("getSibiling : {}", user.getName());		
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getSibilings( user.getName()),HttpStatus.OK);
	}
	
	@RequestMapping(path="/sibilings/count",method = RequestMethod.GET)
	public ResponseEntity<Integer> getSibilingCount( @AuthenticationPrincipal Principal user){
		logger.debug("getSibiling : {}", user.getName());		
		return  new ResponseEntity<Integer>( familyMemberService.getSibilingCount(user.getName()),HttpStatus.OK);
	}
	
	
	@RequestMapping(path="/brother",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getBrother( @AuthenticationPrincipal Principal user){
		logger.debug("getBrother : {}", user.getName());		
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getBrother(user.getName()),HttpStatus.OK);
	}
	
	@RequestMapping(path="/sister",method = RequestMethod.GET)
	public ResponseEntity<List<FamilyMember>> getSister( @AuthenticationPrincipal Principal user){
		logger.debug("getSister : {}", user.getName());		
		return  new ResponseEntity<List<FamilyMember>>( familyMemberService.getSister(user.getName()),HttpStatus.OK);
	}
	
}
