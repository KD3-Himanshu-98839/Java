package com.app.fruits;

public class Mango extends Fruit {
	public Mango() {
		super();
	}

	public Mango(String color, double weight, String name, boolean isFruit) {
		super(color, weight, name, isFruit);
	}

	@Override
	public String taste() {
		return "Taste of Mango is sweet";
	}

}
