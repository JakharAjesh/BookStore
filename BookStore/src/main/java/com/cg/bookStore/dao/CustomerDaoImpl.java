package com.cg.bookStore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.bookStore.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Customer> findAll(){
		String qstr="Select customer From Customer customer";
		TypedQuery<Customer> query=em.createQuery(qstr, Customer.class);
		return query.getResultList();
	}
	
	@Override
	public boolean save(Customer customer) {
		if(customer.getAddress()==null || customer.getCity()==null || customer.getCountry()==null || customer.getEmailAddress()==null || customer.getFullName()==null || 
				customer.getPassword()==null || customer.getPhoneNumber()==null || customer.getZipCode()==0)
		{
			return false;
		}
		em.persist(customer);
		return true;
		
	}
}
