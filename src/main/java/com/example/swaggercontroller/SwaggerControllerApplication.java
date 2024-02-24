package com.example.swaggercontroller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Elisabetta has control",
				version = "beta",
				description = "This is a controller to test the Swagger UI",
				termsOfService = "terms of service",
				contact = @Contact(
						name = "Elisabetta",
						email = "tacconellielisabetta50@gmail.com"
				),
				license = @License(
						name = "MIT licence",
						url = "https://www.mit.edu/~amini/LICENSE.md"
				)
		)
)
public class SwaggerControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerControllerApplication.class, args);
	}

}
