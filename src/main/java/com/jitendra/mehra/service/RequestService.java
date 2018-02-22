package com.jitendra.mehra.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;

@Service
public interface RequestService {
	
	public Page<Request> get(Pageable pageable);
	
	public Request get(RequestAndLikeIdenntity idenntity);
	
	public Page<Request> getByPrimeryId(String id,Pageable pageable);
	
	public Request save(Request request);
	
	public int update(Request request);
	
	public void delete(Request request);
	
	 
	

}
