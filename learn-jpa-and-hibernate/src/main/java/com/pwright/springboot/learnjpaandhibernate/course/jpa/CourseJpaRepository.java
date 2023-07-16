package com.pwright.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.pwright.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext //like @Autowired but more specific
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		// pass in Course and Primary Key
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		// pass in Course and Primary Key
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
