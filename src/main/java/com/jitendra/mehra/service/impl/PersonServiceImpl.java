package com.jitendra.mehra.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.controller.PersonController;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.repository.PersonRepository;
import com.jitendra.mehra.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {
	
	private final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> get() {		
		return personRepository.findAll();
	}

	@Override
	public Person getById(long id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person save(Person person) {
		return personRepository.saveAndFlush(person);
	}
}
