package com.qa.stocktracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "controllers")
@EnableJpaRepositories("repositories")
@EntityScan("entities")
public class StocktrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocktrackerApplication.class, args);
	}

}
