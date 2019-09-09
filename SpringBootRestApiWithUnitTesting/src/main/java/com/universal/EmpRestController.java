package com.universal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpRestController {

	@GetMapping("/data")
	public String getEmpData() {		
		return "Hello";
	}
	
}
