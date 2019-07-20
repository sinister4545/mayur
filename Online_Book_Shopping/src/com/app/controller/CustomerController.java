package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/register")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/customer/register";
	}

	
	
	
	@PostMapping
	public ResponseEntity<String> addCusstomer(@RequestBody Customer c) {
		System.out.println("in add stock " + c);
		try {
			String sts = service.addCustomer(c);
			// success
			return new ResponseEntity<String>(sts, HttpStatus.CREATED);
		} catch (RuntimeException e) {
			System.out.println("err in add stock " + e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
