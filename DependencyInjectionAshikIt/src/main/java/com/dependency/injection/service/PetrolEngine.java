package com.dependency.injection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine  implements Engine{

	@Override
	public int start() {
		System.out.println("Start method :: Petrol Engine ");
		return 0;
	}
}
