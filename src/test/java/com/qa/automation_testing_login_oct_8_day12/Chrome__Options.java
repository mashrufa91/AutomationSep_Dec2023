package com.qa.automation_testing_login_oct_8_day12;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome__Options {

	
		public WebDriver driver;
		public ChromeOptions options;
	
	@BeforeMethod
		
	public void setup() {
		options= new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();

	}

	@Test (priority=1)
	public void regWithValidCredentials() {
	
		driver.findElement(By.linkText("Register")).click();	
	
	driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
	
	driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
	
	driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");
	
	driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
	
	driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
	
	driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");
	
	driver.findElement(By.cssSelector("input[name=agree]")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    
  	
	}	
		
@Test (priority= 2)
public void regWithinValidCredentials() {

driver.findElement(By.linkText("Register")).click();	

driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa1000");

driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");

driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");

driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");

driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");

driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");
driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1).input")).click();
driver.findElement(By.cssSelector("input[name=agree]")).click();
driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
}}
		
	


