package com.jitendra.mehra.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.repository.PersonRepository;
import com.jitendra.mehra.search.Search;
import com.jitendra.mehra.service.PersonService;
import com.jitendra.mehra.utils.DateUtility;


@Service
public class PersonServiceImpl implements PersonService {
	
	private final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private PersonRepository personRepository;

	

	@Override
	public Person getById(long id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person save(Person person) {
		return personRepository.saveAndFlush(person);
	}

	@Override
	public Person update(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void delete(Long id) throws IllegalArgumentException  {
		personRepository.delete(id);
	}

	@Transactional
	@Override
	public int temporyHide(Long id,PersonStatus status) {
		return personRepository.hide(id, status);
	}

	@SuppressWarnings({ "unused" })
	@Override
	public List<Person> search(Search search) {
		 
		String withOutCityAndGotra  = "SELECT p FROM Person p WHERE (p.dob BETWEEN :ageStart AND :ageEnd) AND p.qualification IN (:qualification) "
				+ "AND (p.income BETWEEN :incomeStart AND :incomeEnd) "
				+ "AND p.bodyType IN (:bodyTypes) AND p.complexion IN( :complexions) AND (p.height BETWEEN :heightStart "
				+ "AND :heightEnd) ";
		StringBuffer queryString = new StringBuffer(withOutCityAndGotra);
		
		if( search.getGotra() != null && !search.getGotra().isEmpty() ) {
			queryString.append(" AND p.gotra IN (");
			int iGotra = 1;
			 for (String element : search.getGotra().split(",")) {
				 queryString.append( " :gotra"+iGotra+",");
				 iGotra++;
			}		
			 queryString.setLength(queryString.length() - 1);
			queryString.append("  )");
		}
		
		if( search.getCity()  != null && !search.getCity().isEmpty() ) {
			queryString.append(" AND p.city IN (");
			int iCity = 1;
			 for (String element : search.getCity().split(",")) {
				 queryString.append( " :city"+iCity+",");
				 iCity++;
			}	
			 queryString.setLength(queryString.length() - 1);
			queryString.append("  )");
		}
		
		TypedQuery<Person> query = em.createQuery( queryString.toString() , Person.class) ;
		
		 
		
		
		logger.info("ageStart :{}", DateUtility.decreaseYearsInCurrentDate( new Integer( search.getAge().getStart() ) ) );
		logger.info("ageEnd :{}", DateUtility.decreaseYearsInCurrentDate(  new Integer(search.getAge().getEnd() ) ) );	
		logger.info("qualification :{}", search.getQualifications()  );	
		logger.info("gotra :{}",   search.getGotra() );
		logger.info("incomeStart :{}", new Long( search.getIncome().getStart() ));
		logger.info("incomeEnd :{}", new Long( search.getIncome().getEnd() ) );
		logger.info("city :{}", search.getCity()  );
		logger.info("bodyTypes :{}",  search.getBodyTypes() );
		logger.info("complexions :{}",  search.getComplexions() );
		logger.info("heightStart :{}",  search.getHeight() .getStart()  );
		logger.info("heightEnd :{}",  search.getHeight().getEnd()  );
				
		
		query.setParameter("ageStart", DateUtility.decreaseYearsInCurrentDate( new Integer( search.getAge().getStart() ) ) );
		query.setParameter("ageEnd", DateUtility.decreaseYearsInCurrentDate(  new Integer(search.getAge().getEnd() ) ) );	
		query.setParameter("qualification", search.getQualifications()  );	
		if( search.getGotra() != null && !search.getGotra().isEmpty() ) {
			int iGotra = 1;
			 for (String element : search.getGotra().split(",")) {
				 
				 query.setParameter( "gotra"+iGotra, element  ); 
				 iGotra++;
			}
		}
		query.setParameter("incomeStart", new Long( search.getIncome().getStart() ));
		query.setParameter("incomeEnd", new Long( search.getIncome().getEnd() ) );
		if( search.getCity()  != null && !search.getCity().isEmpty() ) {
			 int iCity = 1;
			 for (String element : search.getCity().split(",")) {
				 query.setParameter( "city"+iCity, element  );
				 iCity++;
			}	
		}
		query.setParameter("bodyTypes",  search.getBodyTypes() );
		query.setParameter("complexions",  search.getComplexions() );
		query.setParameter("heightStart",  search.getHeight().getStart()  );
		query.setParameter("heightEnd",  search.getHeight().getEnd()  );
		
		List<Person> persons = query.getResultList();		
		return   persons;
	}

	@Override
	public Page<Person> get(Pageable pageable) {
		return personRepository.findAll(pageable);
	}

	@Override
	public Page<Person> getByFirstName(String name, Pageable pageable) {
		 return personRepository.getByFirstName(name, pageable);
	}

	@Override
	public Page<Person> getByLastName(String name, Pageable pageable) {
		 return personRepository.getByLastName(name, pageable);
	}

	 

	
}
