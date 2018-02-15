package com.jitendra.mehra.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.controller.PersonController;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.repository.PersonRepository;
import com.jitendra.mehra.search.Search;
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

	@Override
	public List<Person> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person update(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean temporyHide(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Person> search(Search search) {		 
		return personRepository.search(search);
	}
}
