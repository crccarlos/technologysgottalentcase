package com.microservices.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	@RequestMapping("echo")
	public String echo() {
		return "Doctor microservice is here, version 0.0.1";
	}

	@RequestMapping("searchDoctors")
	public String searchDoctors(String medicalSpeciality, String city) {
		return "retrieve a collection of Doctor class (bean), the attribs: Name, Rating, Specialty and Address.";
	}

	@RequestMapping("detailDoctor")
	public String detailDoctor(String doctorId) {
		return "retrieve a bean of Doctor class, the attribs: Name, RatingAverage, Specialty and Address.";
	}
		
}
