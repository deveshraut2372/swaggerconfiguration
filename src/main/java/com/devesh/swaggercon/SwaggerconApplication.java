package com.devesh.swaggercon;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SwaggerconApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerconApplication.class, args);
	}

}
