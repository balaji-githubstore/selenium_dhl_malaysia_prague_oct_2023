package com.dhl.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7CSS {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("bala123456756565@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome123");
		//click on login
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
//		driver.quit();

	
	}
}
