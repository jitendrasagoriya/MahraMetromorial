package com.jitendra.mehra.service.impl;

import java.util.ArrayList;
import java.util.Collection;
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

	@Override
	public FamilyMember save(FamilyMember familyMember) {
		return repository.save(familyMember);
	}

	@Override
	public List<FamilyMember> getByUserName(String name) {
		return repository.getByUserName(name);
	}

	@Override
	public List<FamilyMember> save(Collection<FamilyMember> familyMembers) {		
		return repository.save(familyMembers);		 
	}

	@Override
	public FamilyMember getFather(String name) {		 
		return repository.getFather(name);
	}

	@Override
	public FamilyMember getMother(String name) {
		return repository.getMother(name);
	}

	@Override
	public int getSibilingCount(String name) {
		return repository.getSibilingCount(name);
	}

	@Override
	public List<FamilyMember> getBrother(String name) {
		return repository.getBrother(name);
	}

	@Override
	public List<FamilyMember> getSister(String name) {
		return repository.getSister(name);
	}

	@Override
	public Integer getBrotherCount(String name) {
		return repository.getBrother(name).size();
	}

	@Override
	public Integer getSisterCount(String name) {
		return repository.getSister(name).size();
	}

	@Override
	public List<FamilyMember> getSibilings(String name) {
		List<FamilyMember> sibilings = new ArrayList<>();
		sibilings.addAll( this.getSister(name));
		sibilings.addAll( this.getBrother(name));
		return sibilings;
	}

}
