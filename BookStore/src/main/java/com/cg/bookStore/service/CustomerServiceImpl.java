package com.cg.bookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookStore.dao.CustomerDao;
import com.cg.bookStore.entity.Customer;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public List<Customer> findAll(){
		return customerDao.findAll();
	}
	
	@Override
	public boolean save(Customer customer) {
		return customerDao.save(customer);
	}

}

