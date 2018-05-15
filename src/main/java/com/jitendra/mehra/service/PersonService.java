package com.jitendra.mehra.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.search.Search;



@Service
public interface PersonService {

	 
	public Page<Person> get(Pageable pageable);
	
	public Person getById(String id);
	
	public Person save(Person person);	
	 
	public Page<Person> getByFirstName(String name,Pageable pageable);	
	 
	public Page<Person> getByLastName(String name,Pageable pageable);	
	
	public List<Person> search(Search search );
	
	public Person update(Person person);
	
	public void delete(String Id);
	
	public int temporyHide(String username,PersonStatus status);
	
	public int setProfilePic(String username,String name);
	
	public Person createPerson(Person person);	
	
	public int update( List<ProfileUpdateRequestObject> updateRequestObjects, Person person );
	
	/**
	 * 
	 * new PageRequest(1, 
            10, 
            new Sort(Sort.Direction.DESC, "description")
                    .and(new Sort(Sort.Direction.ASC, "title"));
    );
	 * 
	 * */
	
	
}
