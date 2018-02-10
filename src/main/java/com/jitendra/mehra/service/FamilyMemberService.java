package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.FamilyMember;

@Service
public interface FamilyMemberService {
	
	
	public List<FamilyMember> getByPersonId(Long id); 
	
	public  FamilyMember getById(Long id);
	
	public List<FamilyMember> getByName(String name);

}
