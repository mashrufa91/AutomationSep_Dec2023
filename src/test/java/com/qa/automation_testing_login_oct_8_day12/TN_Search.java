package com.qa.automation_testing_login_oct_8_day12;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TN_Search {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeTest
	
	public void setup() {
		options= new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test
	public void TN_search_valid_prod() {
	driver.findElement(By.name("search")).sendKeys("HP");	
	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
	}
	@Test
	public void TN_search_invalid_prod() {
		
		driver.findElement(By.name("search")).sendKeys("Dell");	
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
			
	}
	
	@AfterMethod
	public void teaDown() {
		driver.quit();
	}
	
	
	}
	
