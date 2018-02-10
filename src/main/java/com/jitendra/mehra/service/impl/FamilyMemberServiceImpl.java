package com.jitendra.mehra.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.repository.FamilyMemberRepository;
import com.jitendra.mehra.service.FamilyMemberService;

@Service
public class FamilyMemberServiceImpl implements FamilyMemberService {
	
	private final Logger logger = LoggerFactory.getLogger(FamilyMemberServiceImpl.class);
	
	@Autowired
	private FamilyMemberRepository repository;

	@Override
	public List<FamilyMember> getByPersonId(Long id) {
		return repository.getByPersonId(id);
	}

	@Override
	public FamilyMember getById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<FamilyMember> getByName(String name) {
		return repository.getByName(name);
	}

}
