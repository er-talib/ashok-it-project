package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.IndicsoftEmployee;
import com.rest.service.IndicsoftEmployeeServiceImplementation;

@RestController
public class MyController {

	@Autowired
	private IndicsoftEmployeeServiceImplementation employeeServiceImplementation;

	@PostMapping("/employee")
	public void saveEmployeeDetails(@RequestBody IndicsoftEmployee indicsoftEmployee) {
		this.employeeServiceImplementation.addEmployeeDetails(indicsoftEmployee);
	}

	@GetMapping("/employee")
	public List<IndicsoftEmployee> findEmployee() {
		return this.employeeServiceImplementation.getDetails();
	}

	@GetMapping("/employee/{id}")
	public Optional<IndicsoftEmployee> findEmployeeById(@PathVariable("id") int id) {
		return this.employeeServiceImplementation.getDetailById(id);
	}

	@PutMapping("/employee")
	public void update(@RequestBody IndicsoftEmployee indicsoftEmployee) {
		this.employeeServiceImplementation.updateDetails(indicsoftEmployee);
	}

	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable int id) {
		this.employeeServiceImplementation.deleteDetails(id);
	}
}
