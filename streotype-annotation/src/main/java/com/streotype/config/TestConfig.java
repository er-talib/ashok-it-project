package com.streotype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.streotype.service.Car;

@Configuration
public class TestConfig {
	
	public TestConfig() {
		System.out.println("Congif:: constructor");
	}
	
	@Bean
	public Car instanceCar() {
		Car obj = new Car();
		return obj ;
	}

}
