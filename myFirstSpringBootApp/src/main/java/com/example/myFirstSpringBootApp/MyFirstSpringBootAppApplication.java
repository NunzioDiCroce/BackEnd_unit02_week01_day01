package com.example.myFirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootAppApplication.class, args);
	}

	public static void configWithAnnotationConfing() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyFirstSpringBootAppApplication.class);

	}

}
