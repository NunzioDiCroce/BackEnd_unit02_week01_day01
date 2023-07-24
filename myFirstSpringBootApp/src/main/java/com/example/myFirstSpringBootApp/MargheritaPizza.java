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
	private String name;
	private String firstTopping;
	private String secondTopping;
	private String calories;

}
