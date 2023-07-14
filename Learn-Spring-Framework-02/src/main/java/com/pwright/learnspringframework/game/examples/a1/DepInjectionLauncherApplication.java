package com.pwright.learnspringframework.game.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

//	Field Injection Example
//	@Autowired	
	Dependency1 dependency1;

// @Autowired	
	Dependency2 dependency2;
	
	// Constructor Injection Example
	// Spring Recommends this approach above the other two options
	// All initialization happens in one method
	@Autowired //(don't even need to have this on the constructor to inject)
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
//	Setter Injection Example
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

//configuration file is where the beans are created, dont need it currently as no beans are created
@Configuration
//instances of PacMan game and GameRunner are being created by spring and auto wired
// if i do not specify package to be scanned("insert package path here")
// component scan assumes its this package path
@ComponentScan // ("package goes here")
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));

		}

	}
}
