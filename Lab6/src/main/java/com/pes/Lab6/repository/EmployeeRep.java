package com.pes.Lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pes.Lab6.model.Employee;

public interface EmployeeRep extends JpaRepository<Employee, Long > {

}
