package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.pojos.Customer;

@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDao dao;
	
	@Override
	public Customer getCustomerById(int customerId) {
		
		return dao.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return dao.getCustomerByUsername(username);
	}

	@Override
	public String addCustomer(Customer customer) {
		
		return dao.addCustomer(customer);
		
	}

}
