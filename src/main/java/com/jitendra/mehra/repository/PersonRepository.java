package com.jitendra.mehra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jitendra.mehra.domin.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {
	

}
