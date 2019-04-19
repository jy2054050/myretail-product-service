package com.target.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.target.product")
@PropertySource("classpath:application.properties")
public class ProductServiceLauncher {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProductServiceLauncher.class, args);
	}
}
