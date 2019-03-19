package com.microservice.clientDoctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
@Service
public class ClientDoctorApplication {

@Autowired

	protected RestTemplate restTemplate;

	protected String serviceUrl;
	
	public ClientDoctorApplication(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl: "http://" + serviceUrl;

	}

	public String searchDoctors(String medicalSpecialty, String city) {
		return restTemplate.getForObject(serviceUrl + "/searchDoctors",String.class, medicalSpecialty, city);
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(ClientDoctorApplication.class, args);
		ClientDoctorApplication ca = new ClientDoctorApplication("http://localhost:1234/");
		ca.searchDoctors("general", "Lima");
	}

}
