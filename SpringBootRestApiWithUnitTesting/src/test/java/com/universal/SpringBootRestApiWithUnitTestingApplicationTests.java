package com.universal;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringBootRestApiWithUnitTestingApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void checkData() throws Exception {
		MvcResult mvcResult=  mockMvc.perform(get("/emp/data")).andReturn();
		MockHttpServletRequest request  =mvcResult.getRequest();
		System.out.println(request);
		MockHttpServletResponse response=mvcResult.getResponse();
		System.out.println(response);
		assertEquals("Hello", response.getContentAsString());
	}

}
