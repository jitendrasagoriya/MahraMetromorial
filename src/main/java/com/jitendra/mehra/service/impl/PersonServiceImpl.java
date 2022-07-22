package com.jitendra.mehra.service.impl;

import java.util.Arrays;
import java.util.LinkedHashSet;
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

import com.jitendra.mehra.domin.FamilyMember;
import com.jitendra.mehra.domin.Person;
import com.jitendra.mehra.domin.UserRoles;
import com.jitendra.mehra.dto.ProfileUpdateRequestObject;
import com.jitendra.mehra.enums.BodyType;
import com.jitendra.mehra.enums.Complexion;
import com.jitendra.mehra.enums.MaritalStatus;
import com.jitendra.mehra.enums.PersonStatus;
import com.jitendra.mehra.enums.Qualification;
import com.jitendra.mehra.enums.Relation;
import com.jitendra.mehra.repository.PersonRepository;
import com.jitendra.mehra.repository.UserRolesRepository;
import com.jitendra.mehra.search.Search;
import com.jitendra.mehra.service.FamilyMemberService;
import com.jitendra.mehra.service.PersonService;
import com.jitendra.mehra.utils.DateUtility;
import com.jitendra.mehra.utils.ProfileReflactionUtility;
import com.jitendra.mehra.utils.Utility;


@Service
public class PersonServiceImpl implements PersonService {
	
	private final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private UserRolesRepository userRolesRepository;

	@Autowired
	private FamilyMemberService familyMemberService;
	

	@Override
	public Person getById(String id) {
		return personRepository.findOne(id);
	}

	@Override
	public Person save(Person person) {
		try {
			person.setId(personRepository.getNextSeriesId());
			person = personRepository.saveAndFlush(person);
			UserRoles userRoles = new UserRoles();
			userRoles.setRole("ROLE_USER");
			userRoles.setUserName(person.getUserName());
			userRolesRepository.save(userRoles);
			
		}catch (Exception e) {
			logger.error(e.getMessage(),e);
		}
		return personRepository.saveAndFlush(person);
	}

	@Override
	public Person update(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void delete(String id) throws IllegalArgumentException  {
		personRepository.delete(id);
	}

	@Transactional
	@Override
	public int temporyHide(String username,PersonStatus status) {
		return personRepository.hide(username, status);
	}
	
	
	@Transactional
	public int update( List<ProfileUpdateRequestObject> updateRequestObjects, Person person ) {
		
		logger.info("Request object {} and person object :{}", updateRequestObjects, person);

		String update = "UPDATE Person p SET ";
		StringBuffer queryString = new StringBuffer(update);
		ProfileReflactionUtility utility = new ProfileReflactionUtility();
		LinkedHashSet<Object> objects = new LinkedHashSet<>();

		for (ProfileUpdateRequestObject profileUpdateRequestObject : updateRequestObjects) {
			String actualValue = utility
					.getPersonPropertyValueByRelflaction(person, profileUpdateRequestObject.getPropertyName())
					.toString();
			if (!actualValue.equalsIgnoreCase(profileUpdateRequestObject.getPropertyValue())) {
				queryString.append("p." + profileUpdateRequestObject.getPropertyName() + " = ?");
				queryString.append(",");

				Object intValue = Utility.getEmumIdByValue(profileUpdateRequestObject.getPropertyName(),
						profileUpdateRequestObject.getPropertyValue());
				if (intValue != null) {
					objects.add(intValue);
				} else {
					objects.add(Utility.getRawTypeValue(
							utility.getType(person, profileUpdateRequestObject.getPropertyName()),
							profileUpdateRequestObject.getPropertyValue()));
				}

			}
		}

		String str = queryString.toString();
		int idx = str.lastIndexOf(",");
		if (idx >= 0) {
			str = str.substring(0, idx) + str.substring(idx + 1);
		}
		queryString = new StringBuffer(str);
		logger.info("queryString :{}", queryString);
		logger.info("input values :{}", objects);

		queryString.append(" WHERE p.userName = ?");

		javax.persistence.Query query = em.createQuery(queryString.toString());
		int i = 1;
		for (Object object : objects) {
			query.setParameter(i++, object);
		}
		query.setParameter(i, person.getUserName());

		logger.info("queryString :{}", queryString);
		logger.info("query :{}", query);
		return query.executeUpdate();
		
	}

	@SuppressWarnings({ "unused" })
	@Override
	public List<Person> search(Search search) {
		 
		String withOutCityAndGotra  = "SELECT p FROM Person p WHERE p.gender = :gender AND p.maritalStatus IN (:maritalStatus) AND (p.dob BETWEEN :ageStart AND :ageEnd) AND p.qualification IN (:qualification) "
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
		logger.info("gender :{}",  search.getGender() );
		logger.info("MaritalStatus :{}",  search.getMaritalStatus() );
				
		
		query.setParameter("gender", search.getGender() );	
		query.setParameter("maritalStatus", search.getMaritalStatus()== null || search.getMaritalStatus().isEmpty()?Arrays.asList(MaritalStatus.values()):search.getMaritalStatus()  );	
		query.setParameter("ageStart", DateUtility.decreaseYearsInCurrentDate( new Integer( search.getAge().getStart() ) ) );
		query.setParameter("ageEnd", DateUtility.decreaseYearsInCurrentDate(  new Integer(search.getAge().getEnd() ) ) );	
		query.setParameter("qualification", search.getQualifications() == null || search.getQualifications().isEmpty()?Arrays.asList(Qualification.values()):search.getQualifications() );	
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
		query.setParameter("bodyTypes",  search.getBodyTypes() == null || search.getBodyTypes().isEmpty()?Arrays.asList(BodyType.values()):search.getBodyTypes() );
		query.setParameter("complexions",search.getComplexions() == null || search.getComplexions().isEmpty()?Arrays.asList(Complexion.values()):search.getComplexions() );
		query.setParameter("heightStart",search.getHeight().getStart()  );
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

	@Transactional
	@Override
	public int setProfilePic(String username, String name) {
		return personRepository.setProfilePic(username, name);
	}

	@Override
	public Person createPerson(Person person) {
		Person temp = new Person();
		temp = this.save(person);
		
		FamilyMember father = new FamilyMember();
		father.setPersonId(temp.getId());
		father.setUserName(temp.getUserName());
		father.setRelation(Relation.FATHER);
		
		
		FamilyMember mother = new FamilyMember();
		mother.setPersonId(temp.getId());
		mother.setUserName(temp.getUserName());
		mother.setRelation(Relation.FATHER);

		familyMemberService.save(Arrays.asList(father,mother));
		 
		return temp;
	}

	 

	
}
