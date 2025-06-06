package com.example.zproject_spring_apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// In order to follow a good strcuture of the Spring app follow the next esteps.
// 1. Create the following packages from de main clas (This one)
// 2. CONTROLLERS where the endpoints most be.
// 3. ENTITIES The description of your model persistance (The data of the DB) 
// 4. SERVICES 
// 	4.1 Services The interface where is indicated the methods
// 	4.2 ServicesImpl The implementation of the methods we want to use.
// 5. REPOSITORIES Facilitate the connection to DB withot the need of use SQL manualy.

@SpringBootApplication
public class ZprojectSpringApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZprojectSpringApirestApplication.class, args);
	}

}
