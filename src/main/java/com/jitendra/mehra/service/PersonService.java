package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.search.Search;



@Service
public interface PersonService {

	public List<Person> get();
	public Person getById(long id);
	public Person save(Person person);
	public List<Person> getByName(String name);
	public List<Person> search(Search search);
	
	public Person update(Person person);
	
	public boolean delete(Long Id);
	
	public boolean temporyHide(Long id);
	
	
}
