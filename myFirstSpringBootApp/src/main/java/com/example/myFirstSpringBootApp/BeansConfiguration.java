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

	@Bean(name = "getMargheritaPizza")
	Pizza getMargheritaPizza() {
		return new Pizza("Margherita Pizza", "tomato", "cheese");

	}

	@Bean(name = "getHawaiianPizza")
	Pizza getHawaiianPizza() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple");

	}

	@Bean(name = "getSalamiPizza")
	Pizza getSalamiPizza() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami");

	}

	@Bean(name = "getCheeseTopping")
	Topping getCheeseTopping() {
		return new Topping();

	}

}
