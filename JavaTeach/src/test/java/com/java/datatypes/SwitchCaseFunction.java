package com.java.datatypes;

public class SwitchCaseFunction {

	public void superHeroOrNot(String superhero) {

		switch (superhero) {

		case "WonderWomen":
			System.out.println("WonderWoman is a hero");
			break;

		case "Ironman":
			System.out.println("IronMan is a superhero");
			break;

		case "Hulk":
			System.out.println("Hulk is a superHero");
			break;

		case "Superman":
			System.out.println("Superman is a hero");
			break;

		case "Flash":
			System.out.println("Flash is a superhero");
			break;

		default:
			System.out.println(superhero + ": This hero I'm not aware");
			break;
		}

// If a condition satisfied and if we don't want to goto next condition we use break statement

// break is a keyword

	}

	public static void main(String[] args) {

		SwitchCaseFunction obj = new SwitchCaseFunction();

		obj.superHeroOrNot("Venisha");
	}

//	public void driverInitalization(String browser) {
//
//		switch (browser) {
//		case "Chrome":
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("google");
//		}
//
//	}

}
