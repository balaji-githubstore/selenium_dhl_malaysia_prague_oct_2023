package com.dhl.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {
	
	public static void main(String[] args) {

		String browser="ed";
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("ch"))
		{
			 driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		System.out.println(driver.getTitle());
		
		//getCurrentUrl - get it and print
		System.out.println(driver.getCurrentUrl());
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
	}
}
