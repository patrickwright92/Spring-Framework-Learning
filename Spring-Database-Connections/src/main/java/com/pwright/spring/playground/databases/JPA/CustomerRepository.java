package com.pwright.spring.playground.databases.JPA;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<JPACustomer, Long> {

  List<JPACustomer> findByLastName(String lastName);
  
  List<JPACustomer> findByHomeAddress(String homeAddress);

  JPACustomer findById(long id);
  
}