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

	@Bean(name = "Hawaiian")
	Pizza getHawaiian() {
		return new Pizza("Hawaiian Pizza", "tomato", "cheese", "ham", "pineapple", 1024, 6.49, PizzaSize.STANDARD);
	}

	@Bean(name = "Salami")
	Pizza getSalami() {
		return new Pizza("Salami Pizza", "tomato", "cheese", "salami", 1160, 5.99, PizzaSize.STANDARD);
	}

	@Bean(name = "Custom")
	Pizza getCustom() {
		return new Pizza("Custom Pizza", "tomato", "cheese", "salami", "onion", 1104 + 86 + 22, 4.99 + 0.99 + 0.69,
				PizzaSize.LARGE);
	}
}
