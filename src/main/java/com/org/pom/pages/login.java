package com.org.pom.pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.framework.config.PageConfig;

import io.cucumber.datatable.DataTable;


public class login extends PageConfig{
	WebDriver driver;
	@FindBy(xpath= "//a[@class='login' and contains(@title,'Log in to your customer ')]")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@name='email_create']")
	WebElement email;
	
	@FindBy(xpath="//i[@class='icon-user left']/parent::span")
	WebElement create_account;
	
	@FindBy(xpath="//input[@type='radio' and @id='id_gender1']")
	WebElement title;
	
	@FindBy(xpath="//input[@name='customer_firstname' and @id='customer_firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='customer_lastname' and @id='customer_lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@type='text' and @id='email']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@type='password' and @id='passwd']")
	WebElement password;
	
	
	
	
	
	@FindBy(xpath="//div[@class='selector']//select[@id='days']")
	WebElement days;
	
	@FindBy(xpath="//div[@class='selector']//select[@id='months']")
	WebElement month;
	
	@FindBy(id="years")
	WebElement year;
	
	@FindBy(xpath="//input[@type='text' and @id='firstname']")
	WebElement first;
	
	@FindBy(xpath="//input[@type='text' and @id='lastname']")
	WebElement last;
	
	@FindBy(xpath="//input[@type='text' and @id='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@type='text' and @id='address1']")
	WebElement address ;
	
	@FindBy(xpath="//input[@type='text' and @id='address2']")
	WebElement address1 ;
	
	@FindBy(xpath="//input[@type='text' and @id='city']")
	WebElement city ;
	
	@FindBy(xpath=	"//select[@name='id_state' and @id='id_state']")
	WebElement state ;
	
	@FindBy(xpath="//input[@type='text' and @id='postcode']")
	WebElement postcode ;
	
	
	@FindBy(xpath=	"//select[@name='id_country' and @id='id_country']")
	WebElement country ;
	
	
	@FindBy(xpath=	"//textarea[@name='other' and @id='other']")
	WebElement Additional ;
	
	@FindBy(xpath="//input[@name='phone' and @id='phone']")
	WebElement homenumber;
	
	
	@FindBy(xpath="//input[@name='phone_mobile' and @id='phone_mobile']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@name='alias' and @id='alias']")
	WebElement futureAdd ;
	
	@FindBy(id="submitAccount")
	WebElement resister;
	public login(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void click_sign_in() {
		sign_in.click();
	}
	public void login() {
		email.sendKeys("mete177@gmail.com");
		 create_account.click();
	}
	public void when_user_account_creation(DataTable dataTable) 	{
		try
		{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println(dataTable);
		HashMap<String,String> input=new HashMap<String,String>(dataTable.asMap(String.class,String.class));
		//System.out.println(input);
		firstname.sendKeys(input.get("First name"));
		Thread.sleep(2000);
		
		lastname.sendKeys(input.get("Last name"));
		
		emailid.sendKeys("Email");
		
		password.sendKeys("Password");
		
		//List<WebElement> selctdrop=driver.findElements(By.className("selector"));
		
		
		Select day=new Select(days);
		day.selectByValue("7");
		
		
		
		
	Select month=new Select(this.month);
		month.selectByValue("7");
	
	Select year=new Select(this.year);
	year.selectByValue("2008");
		
//		first.sendKeys(input.get("First name"));
//		Thread.sleep(2000);
//		
//		last.sendKeys(input.get("Last name"));
		
		company.sendKeys(input.get("Company"));
		
		address.sendKeys("Address");
		
		address1.sendKeys("Address (Line 2)");
		
		city.sendKeys("City");
		
		state.sendKeys("State");
		
		postcode.sendKeys("Zip/Postal Code");
		
		Additional.sendKeys("Additional information");
		
		homenumber.sendKeys("Home phone");
		
		mobilenumber.sendKeys("Mobile phone");
		
		futureAdd.sendKeys("Assign an address alias for future reference.");

}catch(Exception e) {
	System.out.println(e);
	}
}
	
	
	
	
	public void click_resister() {
		sign_in.click();
	}
	}
