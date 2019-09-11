package com.nit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@TestPropertySource("classpath:application-test.properties")
public class SpringBootWithRestAndSwaggerApplicationTests {

	@Autowired
	private MockMvc  mockMvc; 

	@Test
	public void saveEmpTest() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post("/rest/emp/save")
				.contentType(MediaType.APPLICATION_JSON)
				.content(" {\n" +        
						"        \"empName\": \"Amit\",\n" + 
						"        \"empSal\": 40000,\n" + 
						"        \"deptNo\": 20,\n" + 
						"        \"empLoc\": \"Banglore\"\n" + 
						"    }");


		MvcResult result=mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		assertNotNull(response.getContentAsString());
		assertTrue(response.getContentAsString().contains("Employee Data Saved With Id:"));
		assertEquals("text/plain;charset=UTF-8",response.getContentType());

	}
	@Test
	public void getOneEmpTest() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/rest/emp/one/1")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult mvcResult=mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals("application/json;charset=UTF-8",response.getContentType());
		assertNotNull(response.getContentAsString());
		assertEquals(200, response.getStatus());
	}

	@Test
	public void getAllEmpTest() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/rest/emp/all")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult mvcResult=mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals("application/json;charset=UTF-8",response.getContentType());
		assertNotNull(response.getContentAsString());
		assertEquals(200, response.getStatus());
	}
	@Test
	public void updateEmpTest() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.put("/rest/emp/update")
																		.contentType(MediaType.APPLICATION_JSON)
																		.content(" {\n" +
																				"		\"empId\":7,\n"+
																				"        \"empName\": \"Amit\",\n" + 
																				"        \"empSal\": 40000,\n" + 
																				"        \"deptNo\": 20,\n" + 
																				"        \"empLoc\": \"Banglore\"\n" + 
																		"    }");
		MvcResult mvcResult=mockMvc.perform(request).andReturn();
		 MockHttpServletResponse response = mvcResult.getResponse();
		 assertEquals("text/plain;charset=UTF-8",response.getContentType());
		 assertNotNull(response.getContentAsString());
		 assertTrue(response.getContentAsString().contains("Employee Updated Success fully..."));
		
		
	}
	
	@Test
	public void deleteEmpTest() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.delete("/rest/emp/delete/8");
		MvcResult mvcResult=mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		 assertEquals("text/plain;charset=UTF-8",response.getContentType());
		 assertNotNull(response.getContentAsString());
		 assertTrue(response.getContentAsString().contains("Employee Deleted with this Id:"));

		
		
		
	}




}
