package com.microservices.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@RequestMapping("echo")
	public String echo() {
		return "Review microservice is here, version 0.0.1";
	}

	@RequestMapping("listReviews")
	public String listReviews(String doctorId) {
		return "retrieve a collection of Review class (bean), the attribs: DoctorID, PatiendID, Rate, ReviewDesc and Date.";
	}

	@RequestMapping("addReview")
	public String addReview(String doctorId, String dni, String rate, String desc, String date) {
		return "retrieve a state of process to add review.";
	}

	
}
