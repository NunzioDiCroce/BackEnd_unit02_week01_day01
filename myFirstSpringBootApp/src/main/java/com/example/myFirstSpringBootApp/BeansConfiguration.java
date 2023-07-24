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
	Pizza getMargheritaPizza() {
		return new Pizza("Margherita Pizza", "tomato", "cheese", 1104, 4.99, PizzaSize.STANDARD);
	}

	@Bean(name = "Hawaiian")
	Pizza getHawaiianPizza() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple", 1024, 6.49, PizzaSize.STANDARD);
	}

	@Bean(name = "Salami")
	Pizza getSalamiPiazza() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami", 1160, 5.99, PizzaSize.STANDARD);
	}

	@Bean(name = "Custom")
	Pizza getCustomPizza() {
		return new Pizza("Custom Pizza", "tomato", "cheese", "salami", "onion", 1104 + 86 + 22, 4.99 + 0.99 + 0.69,
				PizzaSize.LARGE);
	}

	@Bean(name = "Cheese")
	Topping getCheese() {
		return new Topping("Cheese", 92, 0.69);
	}

	@Bean(name = "Ham")
	Topping getHam() {
		return new Topping("Ham", 35, 0.99);
	}

	@Bean(name = "Onions")
	Topping getOnions() {
		return new Topping("Onions", 22, 0.69);
	}

	@Bean(name = "Pineapple")
	Topping getPineapple() {
		return new Topping("Pineapple", 24, 0.79);
	}

	@Bean(name = "Salami")
	Topping getSalami() {
		return new Topping("Salami", 86, 0.99);
	}
}
