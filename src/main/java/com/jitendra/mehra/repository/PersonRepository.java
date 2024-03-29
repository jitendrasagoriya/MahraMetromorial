package com.jitendra.mehra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.enums.PersonStatus;


public interface PersonRepository extends JpaRepository<Person, String>  {
	
	
	@Query("SELECT p FROM Person p WHERE p.fName = :name")
	public Page<Person> getByFirstName(@Param("name") String name,Pageable pageable);
	
	@Query("SELECT p FROM Person p WHERE p.lName = :name")
	public Page<Person> getByLastName(@Param("name") String name,Pageable pageable);
	
	@Transactional
	@Modifying
	@Query("UPDATE  Person p SET p.personStatus = :status WHERE p.userName = :username")
	public int hide(@Param("username") String username,@Param("status") PersonStatus status);
	
	@Transactional
	@Modifying
	@Query("UPDATE  Person p SET p.profilePic = :name WHERE p.userName = :username")
	public int setProfilePic(@Param("username") String username,@Param("name") String name);
	 
	
	@Query(value = "SELECT nextval('PERSON')", nativeQuery =
            true)
    Long getNextSeriesId();

}
