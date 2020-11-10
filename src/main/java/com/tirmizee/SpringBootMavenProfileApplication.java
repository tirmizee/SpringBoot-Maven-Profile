package com.tirmizee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMavenProfileApplication implements CommandLineRunner {
	
	@Autowired 
	ApplicationContext context;
	
	@Value("${pom.description}") 	
	private String description;
	
	@Value("${pom.test}") 	
	private String test;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMavenProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(test);
		System.out.println(description);
	} 

}
