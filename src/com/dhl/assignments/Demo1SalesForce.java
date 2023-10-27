package com.dhl.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1SalesForce {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("Egypt");
		
		driver.findElement(By.name("CompanyName")).sendKeys("cccs");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.findElement(By.name("start my free trial")).click();
		
		//span[contains(text(),'valid phone')]
		String actualError= driver.findElement(By.xpath("//span[contains(@id,'UserPhone')]")).getText();
		System.out.println(actualError);

	}

}
