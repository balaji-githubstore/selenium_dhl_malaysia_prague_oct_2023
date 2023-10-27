package com.dhl.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo3FBSIgnUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//all findElement method - takes only 0.5 sec to check the presence of element
		driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		
		//20 April 2000
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		//selectMonth.selectByVisibleText("Apr");
		//selectMonth.selectByValue("4");
		selectMonth.selectByIndex(3);
		
		//Select year as 2000
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//select gender as custom 
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
		

	}

}
