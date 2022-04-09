package com.java.string;

public class StringFunction {

	// String is a class

	// String is from CharSequence interface

	public static void main(String[] args) {

		// Declaring String is of 2types:

		// 1. String Literal: (80%)
		String name = "Tom";
		// Advantage of String literal : It will save memory

		// 2. using new keyword: (20%)
		String value = new String("Tom");

		// Why String immutable:

		String name1 = "Jerry";
		name1 = "Solomon";
		System.out.println(name1);

		// Advantage of String literal
		// If we add a new value to the object the old value will not be replaced
		String obj = "Steve";
		System.out.println("The default value: " + obj);

		obj = "Peter";
		System.out.println("After adding adding new value to the object: " + obj);

	}

}
