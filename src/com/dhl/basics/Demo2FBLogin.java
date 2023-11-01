package com.dhl.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver1.get("http://google.com");
		
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		
		
		
		By loc=By.id("email");
//		WebElement element= driver.findElement(loc);
//		element.sendKeys("bala123456756565@gmail.com");
		
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("bala123456756565@gmail.com");
		
		//driver.findElement(By.id("email")).sendKeys("bala123456756565@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		driver1.quit();
	
	}
}
