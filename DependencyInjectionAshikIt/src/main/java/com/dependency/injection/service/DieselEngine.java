package com.dependency.injection.service;

import org.springframework.stereotype.Component;

//@Component
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("Diesle Engine :: Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Diesel Engine  start :: start method");
		return 0;
	}
	
	

}
