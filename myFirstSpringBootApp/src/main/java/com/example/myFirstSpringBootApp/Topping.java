package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Topping {
	protected String name;
	protected double calories;
	protected double price;

	public Topping(String _name, double _calories, double _price) {
		this.name = _name;
		this.calories = _calories;
		this.price = _price;
	}
}
