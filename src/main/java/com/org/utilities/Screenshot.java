package com.org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
static WebDriver driver;
	
	public Screenshot(WebDriver driver)
	{
		this.driver = driver;
	}
	

	
	
	public static void takeScreenshot(String path) throws IOException
	{
		String eleScName="WebElementScreenshot";
		String pageScName="WebPageScreenshot";
		Date date=new Date();
		eleScName=eleScName+date.getTime();
		pageScName=pageScName+date.getTime();
	
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+path+pageScName+".png");
		FileUtils.copyFile(src, destination);
		
	}	
}
