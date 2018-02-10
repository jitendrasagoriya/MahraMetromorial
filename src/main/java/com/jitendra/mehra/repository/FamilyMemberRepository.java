package com.jitendra.mehra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jitendra.mehra.domin.FamilyMember;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {

	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.personId = :id")
	public List<FamilyMember> getByPersonId(@Param("id") Long id);
	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.name = :name")
	public List<FamilyMember> getByName(@Param("name") String name);

}
