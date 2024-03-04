package com.pwright.spring.playground.databases.JPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new JPACustomer("Jack", "Bauer", "123 Main Street"));
			repository.save(new JPACustomer("Chloe", "O'Brian", "456 Second Street"));
			repository.save(new JPACustomer("Kim", "Bauer", "789 Third Street"));
			repository.save(new JPACustomer("David", "Palmer", "45 Omar Street"));
			repository.save(new JPACustomer("Michelle", "Dessler", "Address Not Provided"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(customer -> {
				log.info(customer.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			JPACustomer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");

			log.info("Customer found with findByHomeAddress('45 Omar Street'):");
			log.info("--------------------------------------------");
			repository.findByHomeAddress("45 Omar Street").forEach(street -> {
				log.info(street.toString());
			});
			log.info("");
		};
	}
}
