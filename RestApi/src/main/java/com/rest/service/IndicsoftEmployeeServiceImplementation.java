package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.IndicsoftEmployeeDao;
import com.rest.entity.IndicsoftEmployee;

@Service
public class IndicsoftEmployeeServiceImplementation implements IndicsoftEmployeeService {

	@Autowired
	public IndicsoftEmployeeDao indicsoftEmployeeDao;

	@Override
	public void addEmployeeDetails(IndicsoftEmployee indicsoftEmployee) {
		this.indicsoftEmployeeDao.save(indicsoftEmployee);
	}

	@Override
	public List<IndicsoftEmployee> getDetails() {
		return (List<IndicsoftEmployee>) this.indicsoftEmployeeDao.findAll();
	}

	@Override
	public Optional<IndicsoftEmployee> getDetailById(int empId) {
		return this.indicsoftEmployeeDao.findById(empId);
	}

	@Override
	public void updateDetails(IndicsoftEmployee indicsoftEmployee) {
		this.indicsoftEmployeeDao.save(indicsoftEmployee);
	}

	@Override
	public void deleteDetails(int id) {
		this.indicsoftEmployeeDao.deleteById(id);
	}

}
