package com.java.corejava;

public class LocalAndGlobalVariable {

	String employee = "Tom";
	int a;

	// Local and Global variables
	
	//Local variable : It can only inside the method
	//Global variable : It can be use all over the class

	public void localVariable(String name) {

		System.out.println("The name is: " + name);
		
	}

//	public void localVariable1() {
//		System.out.println("The new name is: "+name);
//	}

	public void globalVariable() {
		System.out.println("The name of employee is: " + employee);
	}
	
	public void globalVariable1() {
		System.out.println("The name of employee is: " + employee);
	}
	
	
	public static void main(String[] args) {
		LocalAndGlobalVariable obj = new LocalAndGlobalVariable();
		obj.globalVariable();
		obj.globalVariable1();
		obj.localVariable("Hardy");
	}

}
