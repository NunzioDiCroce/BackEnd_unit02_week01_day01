package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Pizza {
	protected String name;
	protected String firstTopping;
	protected String secondTopping;
	protected String thirdTopping;
	protected String fourthTopping;
	protected String calories;
	protected double price;
	protected PizzaSize pizzaSize;

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _calories, double _price,
			PizzaSize _pizzaSize) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.calories = _calories;
		this.price = _price;
		this.pizzaSize = _pizzaSize;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping, String _calories,
			double _price, PizzaSize _pizzaSize) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.calories = _calories;
		this.price = _price;
		this.pizzaSize = _pizzaSize;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping, String _fourthTopping,
			String _calories, double _price, PizzaSize _pizzaSize) {
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.calories = _calories;
		this.price = _price;
		this.pizzaSize = _pizzaSize;
	}

}
