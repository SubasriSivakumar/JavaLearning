package com.java.string;

public class StringConcept {

	public static void main(String[] args) {

		String name = "    Ananda Kumar ";
		// Trim
		System.out.println("Before Trim: " + name);
		System.out.println("After trim: " + name.trim());
		System.out.println("***************************");
		
		//Substring:
		String para = "Today Is Wednesday Getup and Work";
		//In order to print only Wednesday we need substring
		//Substring index will start from 0 and end in n-1
		String value = (String) para.subSequence(0, 6);
		System.out.println(value);
		//To print beginning and end index:
		System.out.println(para.substring(9,10));
		//To print all the values from beginning index:
		System.out.println(para.substring(6));
		
		//Index: (Check from First)
		System.out.println("Printing the index value of 'd' from first order");
		System.out.println(para.indexOf('d'));
		//System.out.println(para.indexOf('e'));
		
		//Last indexOf:
		System.out.println("Printing the index value of 'd' from last order");
		System.out.println(para.lastIndexOf('d'));
		
		//Jdk 8:
		//To Join the String:
		//12,December,2021 -> 12-December-2021
		System.out.println(String.join("-", "12","December","2021"));
		
		System.out.println("***********************************");
		
		//To split the string:
		String value1 = "12/December/2021";
		String newValue1[] = value1.split("/");
		for(String v:newValue1) {
			System.out.println(v);
		}

	}

}
