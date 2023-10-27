package com.dhl.advance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9Table {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		List<WebElement> elements= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));	
		
		for(int i=1;i<=elements.size();i++)
		{			
			String name= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
			
			if(name.equals("Brenden Wagner"))
			{
				driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
				break;
			}
		}
		
		
	}

}
