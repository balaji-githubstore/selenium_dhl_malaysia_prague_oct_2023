package com.dhl.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Upload {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Mine\\Balaji-Profile_2023_1.pdf");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Mine\\testlist.txt");
	}

}
