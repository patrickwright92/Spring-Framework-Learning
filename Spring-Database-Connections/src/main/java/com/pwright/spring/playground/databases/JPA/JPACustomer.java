package com.pwright.spring.playground.databases.JPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JPACustomer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String homeAddress;

  protected JPACustomer() {}

  public JPACustomer(String firstName, String lastName, String homeAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s', homeAddress='%s']",
        id, firstName, lastName, homeAddress);
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
  
  public String getHomeAddress() {
	  return homeAddress;
  }
  
}