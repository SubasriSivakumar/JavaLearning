package com.java.string;

public class StringConcept1 {

	
	public static void main(String[] args) {

		String name = "Today Is Thursday";
		
		//SubString:
		//Starting is 0 and ending is n-1
		String today = name.substring(0, 5);
		System.out.println(today);
		
		System.out.println(name.substring(6));
		
		
		//String join:
		//To print 12,November,2021 to 12/November/2021
		
		//String.join is used to join multiple String to one String
		
		String day = "17";
		String month = "November";
		String year = "2021";
		System.out.println(String.join("/", day,month,year));
		
	}

}
