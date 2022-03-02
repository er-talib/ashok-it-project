package com.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.IndicsoftEmployee;

@Repository
public interface IndicsoftEmployeeDao extends CrudRepository<IndicsoftEmployee, Integer> {

}