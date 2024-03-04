package com.pwright.spring.playground.databases.MySQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private MySQLCustomerRepository mySqlCustomerRepository;

	// get all mysql customers
	@GetMapping("/get-all-customers")
	public List<MySQLCustomer> getAllCustomers() {
		return mySqlCustomerRepository.findAll();
	}

	// get a specific mysql customer
	@GetMapping("/get-customer/{id}")
	public MySQLCustomer getSpecificCustomer(@PathVariable("id") Integer id) {
		return mySqlCustomerRepository.findById(id).get();
	}

}