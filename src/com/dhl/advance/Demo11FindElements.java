package com.dhl.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//code to work on FindElements - oct 27

public class Demo11FindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.online.citibank.co.in/");
		

//		List<WebElement> elements=driver.findElements(By.xpath("//a[@class='newclose']"));
//		System.out.println(elements.size());
		
		//element is present or not
		if(driver.findElements(By.xpath("//a[@class='newclose']")).size()>0)
		{
			//element is visible or not
			if(driver.findElement(By.xpath("//a[@class='newclose']")).isDisplayed())
			{
				//click
			}
		}

	}

}
