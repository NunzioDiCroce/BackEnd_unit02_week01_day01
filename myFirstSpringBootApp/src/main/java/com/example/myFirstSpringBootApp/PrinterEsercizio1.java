package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class PrinterEsercizio1 implements IEsercizio1 {

	private String sentence = "Ciao mondo";

	public String print() {
		return sentence;
	}

}
