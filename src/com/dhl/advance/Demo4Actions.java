package com.dhl.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nasscom.in/");
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		
		//mousehover on Become a member 
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Become a Member']"))).perform();
		
		//click on Membership Benefits
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();
		
		//Click on element - Click to Apply Online 
		driver.findElement(By.xpath("//a[text()='Click to Apply Online']")).click();
		
		//Font should match the UI
		//driver.findElement(By.linkText("CLICK TO APPLY ONLINE")).click();
		

	}

}
