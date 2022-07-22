package com.jitendra.mehra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Like;
import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.repository.LikeRepository;
import com.jitendra.mehra.service.LikeService;

@Service
public class LikeServiceImpl implements LikeService {
	
	@Autowired
	private LikeRepository likeRepository;

	@Override
	public Page<Like> get(Pageable pageable) {
		return likeRepository.findAll(pageable);
	}

	@Override
	public Like get(RequestAndLikeIdenntity idenntity) {
		return likeRepository.findOne(idenntity);
	}

	@Override
	public Page<Like> send(String id, Pageable pageable) {
		return likeRepository.send(id, pageable);
	}

	@Override
	public Page<Like> recive(String id, Pageable pageable) {
		return likeRepository.recivied(id, pageable);
	}

	@Override
	public Like save(Like like) {
		return likeRepository.saveAndFlush(like);
	}

	@Override
	public int update(Like like) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Like like) {
		// TODO Auto-generated method stub

	}

}
