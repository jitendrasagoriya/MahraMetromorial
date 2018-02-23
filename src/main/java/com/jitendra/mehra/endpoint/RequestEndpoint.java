package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.enums.RequestStatus;
import com.jitendra.mehra.service.RequestService;

@RestController
@RequestMapping("/api/request")
public class RequestEndpoint {
	
	private final Logger logger = LoggerFactory.getLogger(PersonEndpoint.class);
	
	@Autowired
	private RequestService requestService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/{id}" , method = RequestMethod.POST)
	public ResponseEntity<Request> save(@AuthenticationPrincipal Principal user ,@PathVariable(name="id")  String secoundryId){
		logger.info("save :  id : {}", secoundryId);
		Request request = new Request();	
		RequestAndLikeIdenntity idenntity = new RequestAndLikeIdenntity();
		idenntity.setId(user.getName());
		idenntity.setSecoundryId(secoundryId);
		request.setId(idenntity);
		request.setRequestDate(new Timestamp(System.currentTimeMillis()));
		request.setRequestStatus(RequestStatus.SEND);
		return new ResponseEntity< Request>( requestService.save( request ) ,HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/send" , method = RequestMethod.GET)
	public ResponseEntity<Page<Request>> send(@AuthenticationPrincipal Principal user ,Pageable pageable) {
		logger.info("send :  user name : {}", user.getName());		
		return new ResponseEntity< Page<Request> >( requestService.send(user.getName(), pageable) ,HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/recive" , method = RequestMethod.GET)
	public ResponseEntity<Page<Request>> recive(@AuthenticationPrincipal Principal user ,Pageable pageable) {
		logger.info("recive :  username : {}", user.getName());		
		return new ResponseEntity< Page<Request> >( requestService.recive(user.getName(), pageable) ,HttpStatus.OK);
	}
	
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/accept/{id}" , method = RequestMethod.PUT)
	public ResponseEntity<Boolean> accept(@AuthenticationPrincipal Principal user , @PathVariable(name="id") String id ) {
		logger.info("accept :  username : {}", user.getName());		
		return new ResponseEntity< Boolean>( requestService.accept(id, user.getName())>0?Boolean.TRUE:Boolean.TRUE,HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/decline/{id}" , method = RequestMethod.PUT)
	public ResponseEntity<Boolean> decline(@AuthenticationPrincipal Principal user , @PathVariable(name="id") String id ) {
		logger.info("decline :  username : {}", user.getName());		
		return new ResponseEntity< Boolean>( requestService.decline(id, user.getName())>0?Boolean.TRUE:Boolean.TRUE,HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/waiting/{id}" , method = RequestMethod.PUT)
	public ResponseEntity<Boolean> waiting(@AuthenticationPrincipal Principal user , @PathVariable(name="id") String id ) {
		logger.info("waiting :  username : {}", user.getName());		
		return new ResponseEntity< Boolean>( requestService.waiting(id, user.getName())>0?Boolean.TRUE:Boolean.TRUE,HttpStatus.OK);
	}

}
