package com.app.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCalculatorService.class, TestSingletonConnection.class, 
	TestCaptchaAndOtp.class,TestArmStrongNum.class
})
public class AllTests {

}
