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
	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.userName = :userName")
	public List<FamilyMember> getByUserName(@Param("userName") String userName);
	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation = 0")
	public FamilyMember getFather(@Param("userName") String userName);
	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation = 1")
	public FamilyMember getMother(@Param("userName") String userName);
	
	@Query("SELECT fm FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation in(2,3)")
	public List<FamilyMember> getSibiling(@Param("userName") String userName);
	
	@Query("SELECT count(fm) FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation in(2,3)")
	public int  getSibilingCount(@Param("userName") String userName);
	
	@Query("SELECT count(fm) FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation = 2")
	public List<FamilyMember>  getSister(@Param("userName") String userName);

	
	@Query("SELECT count(fm) FROM FamilyMember fm WHERE fm.userName = :userName and fm.relation = 3")
	public List<FamilyMember>  getBrother(@Param("userName") String userName);


}
