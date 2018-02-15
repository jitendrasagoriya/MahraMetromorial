package com.jitendra.mehra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.search.Search;


public interface PersonRepository extends JpaRepository<Person, Long> {
	
	
	@Query("SELECT p FROM Person p WHERE p.fName = :name")
	public List<Person> getByFirstName(@Param("name") String name);
	
	@Query("SELECT p FROM Person p WHERE p.lName = :name")
	public List<Person> getByLastName(@Param("name") String name);
 
	
	@Query(value = "SELECT p FROM Person p WHERE p.income BETWEEN :#{search.income.start} AND :#{search.income.end}" )
	public List<Person> search(@Param("search") Search search);
	
	
	/**
	 * @Query("SELECT p FROM Person p WHERE p.age BETWEEN :search. AND :ageEnd AND p.qualification IN (:qualification) "
			+ "AND p.gotra IN (:gotra) p.income BETWEEN :incomeStart AND :incomeEnd AND p.city IN (:city) "
			+ "AND p.bodyTypes IN (:bodyTypes) AND p.complexions IN( :complexions) AND p.height BETWEEN :heightStart "
			+ "AND :heightEnd;")
	 * */

}
