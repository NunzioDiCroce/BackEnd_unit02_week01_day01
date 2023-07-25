package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Franchise {
	protected String name;
	protected double price;

	public Franchise(String _name, double _price) {
		this.name = _name;
		this.price = _price;
	}

	@Override
	public String toString() {
		return name + ", " + price;
	}
}