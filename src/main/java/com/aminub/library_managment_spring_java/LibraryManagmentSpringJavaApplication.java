package com.aminub.library_managment_spring_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.aminub.library_managment_spring_java.domain.model")
public class LibraryManagmentSpringJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagmentSpringJavaApplication.class, args);
	}

}