package com.pwright.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pwright.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// JPA -> insert , SpringDataJpa -> save
		repository.save(new Course(1, "Learn AWS Jpa", "pwright"));
		repository.save(new Course(2, "Learn DevOps Jpa", "pwright"));
		repository.save(new Course(3, "Learn Azure Jpa", "pwright"));
		
		// JPA -> just int, SpringDataJpa -> match type as well (Long)
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		// Custom Methods created in CourseSpringDataJpaRepository
		System.out.println(repository.findByAuthor("pwright"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("Learn DevOps Jpa"));
		
		
		
		
		
	}
	
	

}
