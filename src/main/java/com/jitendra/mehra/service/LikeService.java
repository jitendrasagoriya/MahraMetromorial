package com.jitendra.mehra.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Like;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;


@Service
public interface LikeService {

	
	public Page<Like> get(Pageable pageable);
	
	public Like get(RequestAndLikeIdenntity idenntity);
	
	public Page<Like> send(String id,Pageable pageable);
	
	public Page<Like> recive(String id,Pageable pageable);	
	
	public Like save(Like like);
	
	public int update(Like like);
	
	public void delete(Like like);	
}
