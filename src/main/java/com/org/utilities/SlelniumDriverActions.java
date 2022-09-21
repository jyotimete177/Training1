package com.org.utilities;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.framework.config.BaseTest;



public class SlelniumDriverActions {
	static WebDriver driver;

	public static void refresh() {
		BaseTest.getDriver().navigate().refresh();
	}

	public static void switchingMultipleWindowsByTitle(String title) {
		Set<String> windows = BaseTest.getDriver().getWindowHandles();
		for (String window : windows) {
			BaseTest.getDriver().switchTo().window(window);
			if (BaseTest.getDriver().getTitle().contains(title))
				break;
		}
	}

	public static void switchingMultipleWindowsByUrl(String url) {
		Set<String> windows = BaseTest.getDriver().getWindowHandles();
		for (String window : windows) {
			BaseTest.getDriver().switchTo().window(window);
			if (BaseTest.getDriver().getCurrentUrl().contains(url))
				break;
		}
	}

	public static void Alearthandling(String value, String status) {
		if (value.isEmpty() && status.equalsIgnoreCase("accept")) {
			BaseTest.getDriver().switchTo().alert().accept();
		} else if (value.isEmpty() && status.equalsIgnoreCase("dismiss")) {
			BaseTest.getDriver().switchTo().alert().dismiss();
		} else {
			BaseTest.getDriver().switchTo().alert().sendKeys(value);
			BaseTest.getDriver().switchTo().alert().accept();

		}
	}

	public static void pageLoad() {
		BaseTest.getDriver().manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

}
