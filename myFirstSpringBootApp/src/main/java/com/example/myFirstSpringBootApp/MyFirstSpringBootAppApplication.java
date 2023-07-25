package com.example.myFirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootAppApplication.class, args);

		configWithAnnotationConfing();

	}

	public static void configWithAnnotationConfing() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyFirstSpringBootAppApplication.class);

		// - - - - - - - - - - - - - - - ESERCIZIO 1
		ctx.getBean("printEsercizio1");

		// - - - - - - - - - - - - - - - ESERCIZIO 2
		System.out.println(ctx.getBean("MargheritaPizza"));
		System.out.println(ctx.getBean("HawaiianPizza"));
		System.out.println(ctx.getBean("SalamiPizza"));
		System.out.println(ctx.getBean("CustomPizza"));
		System.out.println(ctx.getBean("Cheese"));
		System.out.println(ctx.getBean("Ham"));
		System.out.println(ctx.getBean("Onions"));
		System.out.println(ctx.getBean("Pineapple"));
		System.out.println(ctx.getBean("Salami"));

		ctx.close();

	}

}
