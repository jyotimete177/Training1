package com.org.utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebelements {

	static WebDriver driver;

	public static void clickOnElements(WebElement element) throws Exception {
		try {
			if (element.isDisplayed() && element.isEnabled())
				;
			element.click();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void sendInput(WebElement element, String label) throws Exception {
		try {
			element.isDisplayed();

			element.sendKeys(label);

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public static void clickOnCheckBox(WebElement element) throws Exception {
		try {
			element.isDisplayed();

			element.click();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static String getText(WebElement element) {
		try {
			element.isDisplayed();

		} catch (Exception e) {
			System.out.println(e);
		}
		return element.getText();

	}

	public static String getAttribute(WebElement element, String AttributeName) {
		try {
			element.isDisplayed();
			element.getAttribute(AttributeName);
		} catch (Exception e) {

		}
		return AttributeName;

	}

	public static void moveToElement(WebElement element) {
		try {
			Actions mouse = new Actions(driver);
			mouse.click(element).build().perform();
		} catch (Exception e) {

		}
	}

	public static void moveToElement(String label) {
		try {
			Actions mouse = new Actions(driver);
			String locator = "//*[text()='" + label + "']";
			WebElement element = driver.findElement(By.xpath(locator));
			mouse.click(element).build().perform();
		} catch (Exception e) {

		}
	}

	public static void dragAndDrop(WebElement source, WebElement Destination) {
		try {
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, Destination).build().perform();
		}catch (Exception e) {

		}
		
	}

	public static void clickByJavascriptExecutor(String label) {
		try {
			String locator = "//*[text()='" + label + "']";
			WebElement element = driver.findElement(By.xpath(locator));

			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeAsyncScript("argumets[0].click()", element);
		} catch (Exception e) {

		}

	}

	public static void selectOfWebelemnt(WebElement element, String value, String labelvalue) {
		try {
			String locator="//input[@value='"+value+"']";
		driver.findElement(By.xpath(locator));
		Select ele = new Select(driver.findElement(By.xpath(locator)));
		ele.selectByValue(labelvalue);

	} catch (Exception e) {

	}
	}
	public static void switchToFrame(WebElement frame) {
			try {
				driver.switchTo().frame(frame);
			}
			catch(Exception e){
				
			}
		}


}
	

