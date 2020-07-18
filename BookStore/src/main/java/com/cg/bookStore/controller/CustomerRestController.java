package com.cg.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.entity.Customer;
import com.cg.bookStore.exception.customerException;
import com.cg.bookStore.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerService customerService;
	 
    /*********************************************************************
     This method is created only to check whether the customers are 
     signed-up or not It is nothing to do with Sign-up
     ************************************************************************/
	@GetMapping("/customers")
	public List<Customer> finalAll() {
		
		List<Customer> customer=customerService.findAll();
		return customer;
	}
	
	@PostMapping("/customers")
	public String addCustomer(@RequestBody Customer customer)
	{
		try {
			Boolean status=customerService.save(customer);
			if(!status) {
			
			throw new customerException("Can't Perform Signup Process! Check your Entered data is correct");
			}
		
		}
		catch(DataIntegrityViolationException e) {
			return "EmailId already exist";
		}
		return "Customer Profile Created Successfully";
		
	}

}
