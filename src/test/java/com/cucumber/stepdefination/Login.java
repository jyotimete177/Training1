package com.cucumber.stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.framework.config.BaseTest;
import com.framework.config.TestConfig;
import com.org.pom.pages.login;
import com.org.utilities.Screenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	login pom;
	@Given("open Browser")
	public void open_browser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\automation software\\Driver\\chromedriver.exe");
	   driver=new ChromeDriver();   
	}

	@Given("open url")
	public void open_url() {
		 driver.get("http://automationpractice.com/");
		// BaseTest.lounchBrowser("chrome","http://automationpractice.com/" );
		    driver.manage().window().maximize(); 
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() throws IOException {
	   pom=new login(driver);
	   pom.click_sign_in();
	   Screenshot.takeScreenshot("/target");
	}

	@And("^user pass emailId and Click on Create An Account button$")
	public void click_on_Accout_Creation()
	{
		pom.login();
	}

	@When("when user account creation")
	public void when_user_account_creation(DataTable dataTable) {
	   pom.when_user_account_creation(dataTable);
	}

	@When("User click on Resister button")
	public void user_click_on_resister_button() {
	  
	}
}
