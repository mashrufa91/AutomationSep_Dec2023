package com.qa.testNG.oct_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TN_Reg_testng {
   WebDriver driver;
	
	
	@BeforeTest
	public void setupTN () {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja/demo");
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/h1")).isDisplayed());

	}
	
	@Test
	public void registerTN() {
		
			
			driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
			
			driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
			
			driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia@gmail.com");
			
			driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
			
			driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
			
			driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");

			driver.findElement(By.cssSelector("input[name=agree]")).click();
			
			driver.findElement(By.cssSelector("input[class=btn btn-primary]")).click();	
			String actualmessage = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
			String expectedMessage= "Your Account Has Been Created!";
			Assert.assertEquals(actualmessage, expectedMessage);
		}	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

