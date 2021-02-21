package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		
		String[] names = {"Akash","Adarsh","Vijaya","Vikas","Niraj","Vinod","Nayak"};
		
		for(String name : names) {
		System.out.println(name);
		}
		System.out.println("hii...");
	}

}
