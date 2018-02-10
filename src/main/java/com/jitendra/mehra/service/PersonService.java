package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Person;



@Service
public interface PersonService {

	public List<Person> get();
	public Person getById(long id);
	public Person save(Person person);
	
}
