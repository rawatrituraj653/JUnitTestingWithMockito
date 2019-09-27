package com.app.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ReportGeneration {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestArmStrongNum.class,TestCalculatorService.class);
		int fail=result.getFailureCount();
		int count=result.getRunCount();
		List<Failure> failure=result.getFailures();
		System.out.println("Fail Count:: "+fail);
		System.out.println(count);
		failure.forEach(System.out::println);
		
	}
}
