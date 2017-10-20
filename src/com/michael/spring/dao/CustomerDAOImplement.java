package com.michael.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.michael.spring.entity.Customer;

@Repository
public class CustomerDAOImplement implements CustomerDAO {
	
	//Inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		
		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//Create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		//Execute query and get result list
		List<Customer> customers = theQuery.getResultList();
		
		//Return the results
		return customers;
	}

}
