package com.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageConfig {
WebDriver driver;
public PageConfig(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
