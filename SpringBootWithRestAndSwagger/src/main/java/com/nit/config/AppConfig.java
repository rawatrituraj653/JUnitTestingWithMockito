package com.nit.config;

import static springfox.documentation.builders.PathSelectors.regex;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class AppConfig {
	@Bean
	public Docket getDocketConfig() {		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(basePackage("com.nit.controller.rest"))
				.paths(regex("/rest.*"))
				.build()	
				.apiInfo(apiInfo1());
	}
	private ApiInfo apiInfo1() {
		System.out.println("This is My Mehtod");
		return new ApiInfoBuilder()
				.title("RITURAJ TECH SOLUTION Pvt.Ltd")
				.description("EmployeeCRUD Operations..")
				.contact(new Contact("Rituraj Rawat","https://github.com/rawatrituraj653", "Rituraj4@gmail.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
				.build();
	}
	
}
