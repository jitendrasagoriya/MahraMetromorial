package com.jitendra.mehra.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.FamilyMember;

@Service
public interface FamilyMemberService {
	
	
	public List<FamilyMember> getByPersonId(Long id); 
	
	public  FamilyMember getById(Long id);
	
	public List<FamilyMember> getByName(String name);
	
	public FamilyMember save(FamilyMember familyMember);
	
	public List<FamilyMember> getByUserName(String name);
	
	public List<FamilyMember> save(Collection<FamilyMember> familyMembers);
	
	public FamilyMember getFather(String name);
	
	public FamilyMember getMother(String name);
	
	public int getSibilingCount(String name);
	
	public List<FamilyMember> getBrother(String name);
	
	public List<FamilyMember> getSister(String name);
	
	public Integer getBrotherCount(String name);
	
	public Integer getSisterCount(String name);
	
	public List<FamilyMember> getSibilings(String name);

}
