package com.cg.bookStore.dao;

import java.util.List;

import com.cg.bookStore.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> findAll();
	
	public boolean save(Customer customer);

}

