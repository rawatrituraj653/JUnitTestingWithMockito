 package com.nit.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	
}
