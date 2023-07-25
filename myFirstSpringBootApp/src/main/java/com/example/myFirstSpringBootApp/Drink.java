package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Drink {
	protected String name;
	protected String size;
	protected double calories;
	protected double price;

	public Drink(String _name, String _size, double _calories, double _price) {
		this.name = _name;
		this.calories = _calories;
		this.price = _price;
	}

	@Override
	public String toString() {
		return name + ", " + size + ", " + calories + ", " + price;
	}
}