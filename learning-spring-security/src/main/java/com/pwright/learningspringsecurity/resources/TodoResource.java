package com.pwright.learningspringsecurity.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	private static final List<Todo> TODOS_LIST = 
			List.of(new Todo("patrick", "Learn AWS"),
					new Todo("patrick", "Learn DevOps"), 
					new Todo("patrick", "Learn Azure"));

	// Basic Authentication not recommended for production use, easily able to be
	// decoded

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIST;
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
		return TODOS_LIST.get(0);
	}

	
	@PostMapping("/users/{username}/todos")
	public void CreateTodosForSpecificUser(@PathVariable String username, 
			@RequestBody Todo todo) {
		logger.info("Creating {} for {}", todo, username);
	}

}

record Todo (String username, String description) {}
