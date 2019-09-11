package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService {

	public  Integer saveEmp(Employee emp);
	public  Employee getOneEmp(Integer empId);
	public  List<Employee> getAllEmp();
	public Integer updateEmp(Employee emp); 
	public void deleteEmp(Integer empId);
}
