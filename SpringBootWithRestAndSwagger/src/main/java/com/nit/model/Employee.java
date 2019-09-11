package com.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@Table(name="EMP_Tab")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;
	private Integer deptNo;
	private String empLoc;
}
