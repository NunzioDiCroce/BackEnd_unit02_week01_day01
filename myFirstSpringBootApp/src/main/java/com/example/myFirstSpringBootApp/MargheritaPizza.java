package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class MargheritaPizza extends Product {
	protected String name;
	protected String firstTopping;
	protected String secondTopping;
	protected String calories;

}
