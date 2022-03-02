package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.first.FirstHome;
import com.test.car.CarTest;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {CarTest.class,FirstHome.class})  // @ComponentScan use multiple Classes
//@ComponentScan(basePackageClasses =  CarTest.class) // @ComponentScan use with class name
//@ComponentScan(basePackages = "com.first , com.test") //  multiple package  use in ComponentScan

public class SpringBootApplicationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationTestApplication.class, args);
		
	}

}
