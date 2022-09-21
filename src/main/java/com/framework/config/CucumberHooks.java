package com.framework.config;

import com.webdriver.setup.Drivers;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class CucumberHooks {
	
public  Scenario scenario;


@After
public void tearDown() {
//	if(scenario.isFailed()) {
//		Drivers.getInstance().getDriver().quit();
//	}
}

}
