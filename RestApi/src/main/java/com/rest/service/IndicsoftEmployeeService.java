package com.rest.service;

import java.util.List;
import java.util.Optional;

import com.rest.entity.IndicsoftEmployee;

public interface IndicsoftEmployeeService {

	public void addEmployeeDetails(IndicsoftEmployee indicsoftEmployee);

	public List<IndicsoftEmployee> getDetails();

	public Optional<IndicsoftEmployee> getDetailById(int empId);

	public void updateDetails(IndicsoftEmployee indicsoftEmployee);

	public void deleteDetails(int id);
}
