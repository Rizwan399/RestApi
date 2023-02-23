package com.example.demo.Customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public String addCustomer(Customer customer) {
		repository.save(customer);
		return "Added";
	}
	
	public List<Customer>getCustomer(){
		return repository.findAll();
	}
}
