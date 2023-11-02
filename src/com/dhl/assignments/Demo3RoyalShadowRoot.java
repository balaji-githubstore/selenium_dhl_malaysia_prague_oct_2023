package com.dhl.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3RoyalShadowRoot {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalcaribbean.com/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.linkText("SIGN IN")).click();
		
//		driver.findElement(By.linkText("Create an account")).click();
	//	Thread.sleep(10000);
		
//		option 1 - shadow root handling using javascript
		
		//JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("document.querySelector(\"body > app-root > div > app-login-hybris > div > global-login\").shadowRoot.querySelector(\"sign-in-form\").shadowRoot.querySelector(\"section > a\").click()");
		
		//document.querySelector("global-login").shadowRoot.querySelector("sign-in-form").shadowRoot.querySelector("[aria-label='Create an account']")
	
	
		//option 2 -- handling using findElement - use only css selector                                 
		
		var sc1= driver.findElement(By.cssSelector("global-login")).getShadowRoot();
		
		var sc2=sc1.findElement(By.cssSelector("sign-in-form")).getShadowRoot();
		
		sc2.findElement(By.cssSelector("[aria-label='Create an account']")).click();
	
//		driver.findElement(By.cssSelector("global-login")).getShadowRoot().findElement(By.cssSelector("sign-in-form")).getShadowRoot().findElement(By.cssSelector("[aria-label='Create an account']")).click();
	
//		document.querySelector("global-login").shadowRoot.querySelector("sign-in-form").shadowRoot.querySelector("[aria-label='Create an account']").value='hhhghgghgh'
		
		var scp1= driver.findElement(By.cssSelector("global-login")).getShadowRoot();
		
		var scp2=sc1.findElement(By.cssSelector("create-account[class='hydrated']")).getShadowRoot();
		
		var scp3= scp2.findElements(By.cssSelector("input-text[class='hydrated']")).get(0).getShadowRoot();
		scp3.findElement(By.cssSelector("#input-text-name")).sendKeys("john");
		
		var scp4= scp2.findElements(By.cssSelector("input-text[class='hydrated']")).get(1).getShadowRoot();
		
		scp4.findElement(By.cssSelector("#input-text-lastName")).sendKeys("wick");
		


		
	
	}

}




