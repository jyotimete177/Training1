package com.webdriver.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
	private WebDriver driver;
private static  Drivers instance=new Drivers();

private Drivers() {
	
}
public static Drivers getInstance() {
	
	return instance;
	
}

private void setDriver() {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation Software\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
public WebDriver getDriver() {
	try {
		if(driver==null) {
		setDriver();
		}
		
	}catch(Exception e){
		throw e;
		//System.out.println(e);
	}
	return driver;
	
}
}
