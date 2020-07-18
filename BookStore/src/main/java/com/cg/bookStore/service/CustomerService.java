package com.cg.bookStore.service;

import java.util.List;

import com.cg.bookStore.entity.Customer;

public interface CustomerService {

	public boolean save(Customer customer);

	public List<Customer> findAll();

}

