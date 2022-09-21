package com.framework.config;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver   driver;
public static WebDriver getDriver() {
	
	return driver;
	
}

public static WebDriver lounchBrowser(String browser,String url) {
	switch("browser")
	{
	case "Chrome":
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/BrowserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		break;
	case "Firefox":
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/BrowserDrivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		break;
	case "Edge":
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/BrowserDrivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		break;
		default:
			driver=null;
	}
	return driver;
	
}


}
