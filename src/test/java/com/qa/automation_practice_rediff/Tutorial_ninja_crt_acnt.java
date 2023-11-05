package com.qa.automation_practice_rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial_ninja_crt_acnt {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");

		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Register")).click();	
	
		driver.findElement(By.xpath("//input[starts-with(@id,'input-')]")).sendKeys("Mashrufa123");
		driver.findElement(By.xpath("//input[@id='input-lastname' or @name='lastname']")).sendKeys("Shanjia100");
		
		
	
	}

}
