package com.java.datatypes;

public class ForLoopConcept {

	public static void main(String[] args) {

		// while loop and for loop
		// While loop - when iterator concept comes we will use while loop
		// For loop - majority cases

		// ForLoop:initialization , declaration , increment or decrement

		// Increment (odd number)
		for (int number = 1; number <= 20; number = number + 2) {
			System.out.println(number);
		}

		System.out.println("**************************************");

		// Decrement(Even number)
		for (int obj = 10; obj >= 0; obj = obj - 2) {
			System.out.println(obj);
		}
		System.out.println("**************************************");

		// While loop
		int val = 0;
		while (val < 10) {
			System.out.println(val);
			val = val + 1;
		}
		System.out.println("**************************************");

	}

}
