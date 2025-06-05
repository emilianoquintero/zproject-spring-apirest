package com.example.zproject_spring_apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// In order to follow a good strcuture of the Spring app follow the next esteps.
// 1. Create the following packages from de main clas (This one)
// 2. controllers
// 3. entities
// 4. services
// 5. repositories

@SpringBootApplication
public class ZprojectSpringApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZprojectSpringApirestApplication.class, args);
	}

}
