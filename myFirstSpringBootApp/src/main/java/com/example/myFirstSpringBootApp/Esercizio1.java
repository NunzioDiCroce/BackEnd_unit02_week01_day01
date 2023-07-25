package com.example.myFirstSpringBootApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Esercizio1 {
	protected String sentence;

	public Esercizio1(String _sentence) {
		this.sentence = _sentence;
	}

	@Override
	public String toString() {
		return sentence;
	}
}