package com.java.datatypes;

public class StaticArrayConcept {

	public void arrayFunction() {
		// Static Array []
		// storing similar data type under one variable
		// Array index will always start from 0

		int obj[] = new int[6];
		obj[0] = 123;
		obj[1] = 234;
		obj[1] = 100;
		obj[2] = 12;
		obj[2] = 15;
		obj[2] = 400; // Only latest value will be printed
		obj[3] = 0;
		obj[4] = 10;

		// Length of the array:
		System.out.println("The length of the array: " + obj.length);

		System.out.println("*******************************************");

		// Printing the value through index:
		System.out.println(obj[3]);
		System.out.println("*******************************************");
		System.out.println(obj[2]);
		System.out.println("*******************************************");
		System.out.println(obj[1]);
		System.out.println("*******************************************");

		obj[5] = 1000;
		System.out.println(obj[5]);

		// ForLoop:
		for (int number = 0; number < obj.length; number = number + 2) {
			System.out.println(obj[number]);
		}
		System.out.println("*******************************************");

		// ForEach:
		for (int val : obj) {
			System.out.println(val);
		}

		System.out.println("*******************************************");

		Object[] a = new Object[5];
		a[0] = 10;
		a[1] = 10.234;
		a[1] = 123.456;
		a[1] = 0.334;
		a[2] = 'N';
		a[3] = "Venisha";
		a[4] = true;

		System.out.println(a[1]);

		System.out.println("*******************************************");

		// ForEach:
		for (Object val1 : a) {
			System.out.println(val1);
		}

		// Disadvantage : Size is fixed

	}

	public static void main(String[] args) {

		StaticArrayConcept concept = new StaticArrayConcept();
		concept.arrayFunction();

	}

}
