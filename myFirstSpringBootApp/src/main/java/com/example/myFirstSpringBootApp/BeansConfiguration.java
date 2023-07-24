package com.example.myFirstSpringBootApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BeansConfiguration {

	@Bean(name = "printEsercizio1")
	void print() {
		System.out.println();
		System.out.println("Ciao mondo");
		System.out.println();
	}

	@Bean(name = "Margherita")
	Pizza getMargherita() {
		return new Pizza("Margherita Pizza", "tomato", "cheese", 1104, 4.99, PizzaSize.STANDARD);
	}
}
