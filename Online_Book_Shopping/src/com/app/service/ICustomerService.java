package com.app.service;

import java.util.List;

import com.app.pojos.Customer;

public interface ICustomerService {

	public String addCustomer(Customer customer);
	
	Customer getCustomerById(int customerId);
	
	List<Customer> getAllCustomers();

	public Customer getCustomerByUsername(String username);
}
