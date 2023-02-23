package com.example.demo.Customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControl {
	
	@Autowired
	CustomerService service;
	
	@PostMapping("/customer")
	public String create(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> read(){
		return service.getCustomer();
	}
}