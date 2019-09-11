package com.nit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@RestController
@RequestMapping("/rest/emp")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee){
		Integer id=service.saveEmp(employee);
		ResponseEntity<String>entity=new ResponseEntity<String>("Employee Data Saved With Id:: "+id, HttpStatus.OK);
		return entity;
	}

	@GetMapping("/one/{eid}")
	public ResponseEntity<?> getOne(@PathVariable Integer eid){
		ResponseEntity<?> entity=null;
		Employee emp=service.getOneEmp(eid);
		if(emp!=null) {
			entity=new ResponseEntity<Employee>(emp,HttpStatus.OK);
		}
		else {
			entity=new ResponseEntity<String>("Emp Data is not Aviable....!!",HttpStatus.BAD_REQUEST);
		}
		return entity;

	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee>list= service.getAllEmp();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String > updateEmp(@RequestBody Employee emp){
		ResponseEntity<String> res=null;
		Integer empId=service.updateEmp(emp);
		String msg="Employee Updated Success fully..."+empId;
		res=new ResponseEntity<String>(msg,HttpStatus.OK);
		return res;
	}
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> deleteEmp(@PathVariable Integer eid){
		ResponseEntity<String> res=null;
		service.deleteEmp(eid);
		res=new ResponseEntity<String>("Employee Deleted with this Id: "+eid,HttpStatus.OK);
		return res;
	}
	
}
