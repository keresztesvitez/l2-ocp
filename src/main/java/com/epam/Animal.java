package com.epam;

public enum Animal {
	DOG("Woof!"), CAT("Meow!"), DUCK("Quack!");

	private String says;

	Animal(String says) {
		this.says = says;
	}

	public String speak() {
		return this.says;
	}
}
