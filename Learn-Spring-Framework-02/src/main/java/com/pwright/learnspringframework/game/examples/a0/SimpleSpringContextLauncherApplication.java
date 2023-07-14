package com.pwright.learnspringframework.game.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuration file is where the beans are created, dont need it currently as no beans are created
@Configuration
//instances of PacMan game and GameRunner are being created by spring and auto wired
// if i do not specify package to be scanned("insert package path here")
// component scan assumes its this package path
@ComponentScan//("package goes here")
public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(SimpleSpringContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
		}

	}
}
