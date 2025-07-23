package com.oreilly.demo;

import com.oreilly.demo.dao.ProductRepository;
import com.oreilly.demo.entities.Product;
import com.oreilly.demo.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialiseDatabase(ProductService service){
		return args -> {service.initialiseDatabase();};
	}

}
