package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class PrinterEsercizio1 {

	private String sentence;

	public PrinterEsercizio1(String string) {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println(sentence);

	}

}
