package com.example.myFirstSpringBootApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeansConfigurationEsercizio1 {

	@Bean
	void print() {
		System.out.println("Ciao mondo");
	}

}
