package com.bookcatalog.springboot.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan("com.bookcatalog")
@EnableJpaRepositories
@EnableWebSecurity

public class CrudprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudprojectApplication.class, args);
	}

}
