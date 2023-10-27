package com.dhl.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2DBFree {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");
		
		//click on phpMyAdmin »
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		//enter password as admin123
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		//click on login
		driver.findElement(By.id("input_go")).click();
		
		
		String actualError=driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
		
		driver.close(); //check which tab is closed
		
		driver.switchTo().window(windows.get(0));

		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
