package com.framework.config;

import org.openqa.selenium.WebDriver;

import com.webdriver.setup.Drivers;

public class TestConfig {

	public WebDriver getDriver() {
		return Drivers.getInstance().getDriver();
		
	}
}
