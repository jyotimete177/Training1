package com.webdriver.setup;

import org.openqa.selenium.WebDriver;

public class LounchUrl {
	
	
	public static void main(String[] args) {
	WebDriver driver=Drivers.getInstance().getDriver();
	driver.get("https://www.geeksforgeeks.org/singleton-class-java");
		driver.manage().window().maximize();

	}

}
