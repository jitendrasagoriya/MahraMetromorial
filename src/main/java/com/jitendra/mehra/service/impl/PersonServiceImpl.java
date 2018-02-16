package com.jitendra.mehra.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitendra.mehra.domin.Person;
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
		
		 
		
		TypedQuery<Person> query = em.createQuery( queryString.toString() , Person.class);
		
		
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
		 
		for (Parameter parameter : query.getParameters()) {
			System.out.println(parameter.getName() + " : "+ parameter.getParameterType() + " : "+ query.getParameterValue(parameter.getName()));
		}
		return query.getResultList();
	}
	
	
	public List<Person> search1(Search search) {
		
		
		
		 
		String withOutCityAndGotra  = "SELECT p FROM Person p WHERE  p.bodyType IN (:bodyTypes)";
		 
		 
		
		TypedQuery<Person> query = em.createQuery( withOutCityAndGotra  , Person.class);
		
		
		 
		logger.info("bodyTypes :{}",  search.getBodyTypes() );
		 
		
		 
		query.setParameter("bodyTypes",  search.getBodyTypes() );
		 
		for (Parameter parameter : query.getParameters()) {
			System.out.println(parameter.getName() + " : "+ parameter.getParameterType() + " : "+ query.getParameterValue(parameter.getName()));
		}
		return query.getResultList();
	}
	

	
	
}
