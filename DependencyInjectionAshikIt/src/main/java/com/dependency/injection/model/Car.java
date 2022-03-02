package com.dependency.injection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dependency.injection.service.Engine;

@Component
public class Car {

	@Autowired    // dependenci inject by field injection
//	@Qualifier("DiesalEngine") 
	public Engine engine;
	
//	@Autowired     Dependenci inject by setter injection
//	public void setEngine(Engine engine) {
//		System.out.println("Car::setter Injection called");
//		this.engine = engine;
//	}
	
	
	
//	@Autowired     Dependenci inject by constructor injection
//	public Car( Engine engine) {
//		System.out.println("Constructor Injection :: Petrol Engine");
//		this.engine = engine ;
//	}
	
	public void drive(){
		 int start = engine.start();
	     if(start == 0 ) {
	    	 System.out.println("Engine start");
	     }
	}
	
}
