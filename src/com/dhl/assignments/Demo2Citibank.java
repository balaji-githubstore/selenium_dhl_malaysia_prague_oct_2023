package com.dhl.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2Citibank {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		
		
//		approach 1 - not working
//		driver.findElement(By.id("bill-date-long")).sendKeys("14/12/2000");
		
//		approach 2 
//		driver.findElement(By.id("bill-date-long")).click();
//		
//		Select selectYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		selectYear.selectByVisibleText("2000");
//		
//		Select selectMonth=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		selectMonth.selectByVisibleText("Dec");
//		
//		driver.findElement(By.linkText("14")).click();
		
		
//		approach 3 - only js
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.querySelector('#bill-date-long').value='15/12/2000'");
		
		
//		approach 4 - webelement and js
//		WebElement ele1= driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='15/12/2000'", 
				driver.findElement(By.xpath("//input[@id='bill-date-long']")));
	}

}






