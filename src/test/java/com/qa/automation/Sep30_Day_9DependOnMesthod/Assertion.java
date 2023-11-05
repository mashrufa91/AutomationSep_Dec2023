package com.qa.automation.Sep30_Day_9DependOnMesthod;
//there are two types of assertion
//1st at webpage level 
//2nd at webelement level is enabled, isselected

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
// assert is also called hard assert
	//softAssert
	//assert is a class wich has lots of methods in assertion or validation
	// assert. assert true
	//Assert.fail
	//Assert.assertEquals
	
	WebDriver driver;
	@BeforeMethod
	public void opnApplctn() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
	}

	@Test (priority=1)
	public void loginTest() {
        driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	@Test (priority=2)
	public void logout() {
		
		 driver.findElement(By.linkText("Login")).click();
			
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("selenium123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test (priority=3)
	public void continueButtonlogout() {
		
		 driver.findElement(By.linkText("Login")).click();
			
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("selenium123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.linkText("Continue")).click();
			
	
}

	
	
	
	
}
