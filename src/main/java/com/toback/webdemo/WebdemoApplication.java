package com.toback.webdemo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebdemoApplication {
	private Company company;
    private School school;

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue="World") String name)
	{
		return String.format("Hello %s!", name);
	}

	@GetMapping("/api/spring/company/{companyName}")
	public String getCompany(@PathVariable String companyName) throws JSONException {
		return company.getCompanyInfo(companyName).toString();
	}

	@GetMapping("/api/spring/school/{schoolName}")
	public String getSchool(@PathVariable String schoolName) throws JSONException {
		return school.getSchoolInfo(schoolName).toString();
	}
}
