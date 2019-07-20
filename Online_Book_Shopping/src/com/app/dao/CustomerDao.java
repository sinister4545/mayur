package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Customer;

public class CustomerDao implements ICustomerDao {

	@Autowired
	SessionFactory sf;
	@Override
	public String addCustomer(Customer customer) {
		sf.getCurrentSession().persist(customer);
		return null;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		
		return sf.getCurrentSession().get(Customer.class, customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		String jpql = "select c from customer c";
		return sf.getCurrentSession().createQuery(jpql,Customer.class).getResultList();
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		String jpql = "select c from customer c where c.username=:us";
		return sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("us", username).getSingleResult();
	}

}
