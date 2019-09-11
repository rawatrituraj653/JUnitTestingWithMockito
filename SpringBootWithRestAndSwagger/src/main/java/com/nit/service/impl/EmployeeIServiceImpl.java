package com.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.repo.EmployeeRepository;
import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@Service
public class EmployeeIServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmp(Employee emp) {
		Employee employee=repo.save(emp);
	return employee.getEmpId();
	}

	@Override
	public Employee getOneEmp(Integer eid) {
			Optional<Employee> opt=repo.findById(eid);
			if(opt.isPresent()) {
				return opt.get();
			}
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		return repo.findAll();	
	}

	@Override
	public Integer updateEmp(Employee emp) {
		return  repo.save(emp).getEmpId();
	}

	@Override
	public void deleteEmp(Integer empId) {
		repo.deleteById(empId);
	}

	
}
