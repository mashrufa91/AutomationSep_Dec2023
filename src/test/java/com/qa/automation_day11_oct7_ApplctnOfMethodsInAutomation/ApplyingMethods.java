package com.qa.automation_day11_oct7_ApplctnOfMethodsInAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	
	
          
		driver.findElement(By.linkText("Register")).click();	
		
		driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
		
		driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
		
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");
		
		driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
		
		driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");

		driver.findElement(By.cssSelector("input[name=agree]")).click();
		
		driver.findElement(By.cssSelector("input[class=btn btn-primary]")).click();	
		
		
	}
	
	
	
	
}
