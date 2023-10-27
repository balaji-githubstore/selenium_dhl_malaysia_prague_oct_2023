package com.dhl.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10FindElements {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		
//		elements.get(1).click();
//		System.out.println(elements.get(0).getText());
//		System.out.println(elements.get(0).getAttribute("href"));
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			System.out.println(elements.get(i).getAttribute("href"));
		}
	}

}
