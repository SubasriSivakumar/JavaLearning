package com.java.corejava;

public class ReturnType {

	public int addition(int a, int b) {
		int c = a + b;
		System.out.println("The output is: " + c);
		return c;
	}

	public int subtraction(int x, int y) {
		int z = x - y;
		System.out.println("The output is: " + z);
		return z;
	}
	
	public String employee(String name) {
		
		name = "Steve";
		System.out.println("The name of the employee is: "+name);
		return name;
	}
	
	public static void main(String[] args) {

		ReturnType obj = new ReturnType();
		int addValue = obj.addition(10, 20);
		int subValue = obj.subtraction(10, 5);
		
		
		
		
		
		
		System.out.println(addValue - subValue);

	}

}
