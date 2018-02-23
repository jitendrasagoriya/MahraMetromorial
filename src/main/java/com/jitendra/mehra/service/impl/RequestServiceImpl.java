package com.jitendra.mehra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.repository.RequestRepository;
import com.jitendra.mehra.service.RequestService;

@Service
public class RequestServiceImpl implements RequestService{
	
	
	@Autowired
	private RequestRepository requestRepository;

	@Override
	public Page<Request> get(Pageable pageable) {
		return requestRepository.findAll(pageable);
	}

	@Override
	public Request get(RequestAndLikeIdenntity idenntity) {
		return requestRepository.findOne(idenntity);
	}

	@Override
	public Page<Request> send(String id,Pageable pageable) {
		return requestRepository.send(id, pageable);
	}

	@Override
	public Request save(Request request) {
		return requestRepository.saveAndFlush(request);
	}

	@Override
	public int update(Request request) {
		try {
			requestRepository.saveAndFlush(request);
			return 1;
		}catch (Exception e) {
			return 0;
		}		
	}

	@Override
	public void delete(Request request) {
		requestRepository.delete(request);		
	}

	@Override
	public Page<Request> recive(String id, Pageable pageable) {
		return requestRepository.recivied(id, pageable);
	}

	@Override
	public int accept(String id, String sId) {
		return requestRepository.accept(id, sId);
	}

	@Override
	public int decline(String id, String sId) {
		return requestRepository.decline(id, sId);
	}

	@Override
	public int waiting(String id, String sId) {
		return requestRepository.waiting(id, sId);
	}

}
