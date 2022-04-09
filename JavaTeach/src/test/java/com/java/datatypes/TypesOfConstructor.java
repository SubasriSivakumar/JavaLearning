package com.java.datatypes;

public class TypesOfConstructor {

	// Default Constructor
	String name;
	int a;
	double b;

	// Non Parameterized Constructor
	TypesOfConstructor() {
		System.out.println("This is a non parameterized constructor");
	}

	// Parameterized Constructor
	TypesOfConstructor(String name) {
		System.out.println("This is a parameterized constructor: " + name);
	}

	public static void main(String[] args) {

		TypesOfConstructor obj = new TypesOfConstructor();

		System.out.println(obj.name);
		System.out.println(obj.a);
		System.out.println(obj.b);

		TypesOfConstructor obj1 = new TypesOfConstructor("Victor");

	}

}
