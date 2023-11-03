package com.dhl.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4RoyalShadowRoot2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalcaribbean.com/account/signin");
		
		
//		document.querySelector("body > app-root > div > app-login-hybris > div > global-login").shadowRoot
//		.querySelector("create-account").shadowRoot
//		.querySelector("section > form > input-text:nth-child(2)").shadowRoot
//		.querySelector("#input-text-name")
		
		Thread.sleep(5000);
		
		SearchContext sc1=driver.findElement(By.cssSelector("global-login")).getShadowRoot();
		
		SearchContext sc2= sc1.findElement(By.cssSelector("create-account")).getShadowRoot();
		
		String text=sc2.findElement(By.cssSelector("p[class='create-account__subtitle']")).getText();
		System.out.println(text);
		
		String h1=sc2.findElement(By.cssSelector("h1")).getText();
		System.out.println(h1);
		
//		SearchContext fNameSR= sc2.findElement(By.cssSelector("input-text[class='hydrated']")).getShadowRoot();
//		fNameSR.findElement(By.cssSelector("#input-text-name")).sendKeys("john");
//		
		
		SearchContext fNameSR= sc2.findElements(By.cssSelector("input-text[class='hydrated']")).get(0).getShadowRoot();
		fNameSR.findElement(By.cssSelector("#input-text-name")).sendKeys("john");
		
		
		SearchContext lNameSR= sc2.findElements(By.cssSelector("input-text[class='hydrated']")).get(1).getShadowRoot();
		lNameSR.findElement(By.cssSelector("input")).sendKeys("wick");
		
		SearchContext eNameSR= sc2.findElements(By.cssSelector("input-text[class='hydrated']")).get(2).getShadowRoot();
		eNameSR.findElement(By.cssSelector("input")).sendKeys("john1233444@gmail.com");
		
		SearchContext aNameSR= sc2.findElements(By.cssSelector("input-text[class='hydrated']")).get(3).getShadowRoot();
		aNameSR.findElement(By.cssSelector("input")).sendKeys("john");
		
//		SearchContext pNameSR= sc2.findElements(By.cssSelector("input-password[class='hydrated']")).get(0).getShadowRoot();
//		pNameSR.findElement(By.cssSelector("input")).sendKeys("Welcome@123");
	
		SearchContext sNameSR= sc2.findElements(By.cssSelector("input-select")).get(0).getShadowRoot();
		Select selectCo=new Select(sNameSR.findElement(By.cssSelector("select")));
		selectCo.selectByVisibleText("China");
//		selectsq.selectByValue("WHERE_DID_YOU_TAKE_YOUR_FIRST_VACATION");
		
//		for(var ele : selectsq.getOptions())
//		{
//			System.out.println(ele.getText());
//		}
		
		SearchContext sNameSR1= sc2.findElements(By.cssSelector("input-select")).get(1).getShadowRoot();
		Select selectSR=new Select(sNameSR1.findElement(By.cssSelector("select")));
		selectSR.selectByVisibleText("What is the name of the street where you first lived?");
	}

}




