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

import com.jitendra.mehra.domin.Like;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.enums.RequestStatus;
import com.jitendra.mehra.service.LikeService;

@RestController
@RequestMapping("/api/like")
public class LikeEndpoint {

	private final Logger logger = LoggerFactory.getLogger(LikeEndpoint.class);
	
	@Autowired
	private LikeService likeService;
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/{id}" , method = RequestMethod.POST)
	public ResponseEntity<Like> save(@AuthenticationPrincipal Principal user ,@PathVariable(name="id")  String secoundryId){
		logger.info("save :  id : {}", secoundryId);
		Like like = new Like();	
		RequestAndLikeIdenntity idenntity = new RequestAndLikeIdenntity();
		idenntity.setId(user.getName());
		idenntity.setSecoundryId(secoundryId);
		like.setId(idenntity);
		like.setRequestDate(new Timestamp(System.currentTimeMillis()));		 
		return new ResponseEntity< Like>( likeService.save( like ) ,HttpStatus.OK);
	}
	
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/send" , method = RequestMethod.GET)
	public ResponseEntity<Page<Like>> send(@AuthenticationPrincipal Principal user ,Pageable pageable) {
		logger.info("send :  user name : {}", user.getName());		
		return new ResponseEntity< Page<Like> >( likeService.send(user.getName(), pageable) ,HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@RequestMapping(path = "/recive" , method = RequestMethod.GET)
	public ResponseEntity<Page<Like>> recive(@AuthenticationPrincipal Principal user ,Pageable pageable) {
		logger.info("recive :  username : {}", user.getName());		
		return new ResponseEntity< Page<Like> >( likeService.recive(user.getName(), pageable) ,HttpStatus.OK);
	}
	
}
