package org.github.jecihjoy.keycloakspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakSpringBootApplication.class, args);

		System.out.println("server started successfully");
	}

}
