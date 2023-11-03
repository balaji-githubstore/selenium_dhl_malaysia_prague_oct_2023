package com.dhl.advance;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Demo14FluentWait {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(500)); //by default it is 500ms
		wait.withTimeout(Duration.ofMillis(20000));
		wait.ignoring(NoAlertPresentException.class,StaleElementReferenceException.class);
		
		
		
		
		//driver.findElement(By.id("onetrust-accept-btn-handler1234")).click();
		
		//passing function as an arguments
//		wait.until(x->x.findElement(By.id("onetrust-accept-btn-handler1234"))).click();
		
		wait.until(x->x.switchTo().alert()).accept();
		
	}

}
