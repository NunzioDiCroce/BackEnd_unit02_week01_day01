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

	public Pizza(String _name, String _firstTopping, String _secondTopping) {
		super();
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping) {
		super();
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.thirdTopping = _thirdTopping;
	}

	public Pizza(String _name, String _firstTopping, String _secondTopping, String _thirdTopping,
			String _fourthTopping) {
		super();
		this.name = _name;
		this.firstTopping = _firstTopping;
		this.secondTopping = _secondTopping;
		this.thirdTopping = _thirdTopping;
		this.fourthTopping = _fourthTopping;
	}

}
