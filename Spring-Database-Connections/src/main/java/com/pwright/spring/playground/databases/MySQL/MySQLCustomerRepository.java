package com.pwright.spring.playground.databases.MySQL;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MySQLCustomerRepository extends JpaRepository<MySQLCustomer, Integer> {

	
}

