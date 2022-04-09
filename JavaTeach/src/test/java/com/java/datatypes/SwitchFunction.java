package com.java.datatypes;

public class SwitchFunction {
	String heroname = "CaptainMarvel";

	public void heroOrNot() {
		switch (heroname) {
		case "CaptainAmerica":
			System.out.println("Captain is a hero");
			break;
		case "Hulk":
			System.out.println("Hulk is a hero");
			break;
		case "Superman":
			System.out.println("Superman is a hero");
			break;
		case "Ironman":
			System.out.println("Ironman is a hero");
			break;
		default:
			System.out.println(heroname + " : The mentioned name is not in herolist");

		}
	}

	public static void main(String[] args) {
		SwitchFunction obj = new SwitchFunction();
		obj.heroOrNot();

	}

}
