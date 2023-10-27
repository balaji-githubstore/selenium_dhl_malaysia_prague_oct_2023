package com.dhl.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Alert {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		//click on go
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		
		//wait for alert present
		
		Alert alert= driver.switchTo().alert();
		
		String actualAlertText=alert.getText();
		System.out.println(actualAlertText);
		
		alert.accept();

	}

}




