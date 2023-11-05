package com.qa.automation_testing_login_oct_8_day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_testng {
public WebDriver driver;
	@BeforeTest
	public void setup() {WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://rediff.com");
driver.findElement(By.partialLinkText("Sign")).click();}

@Test
public void redif_login_valid_credential() {
	driver.findElement(By.id("login1")).sendKeys("Mashrufa");
	driver.findElement(By.name("passwd")).sendKeys("Mashrufa@123");
	driver.findElement(By.name("remember")).click();
	driver.findElement(By.className("signinbtn")).click();	
	
}
@Test
public void redif_login_invalid_credential() {
	driver.findElement(By.id("login1")).sendKeys("Mashrufa1");
	driver.findElement(By.name("passwd")).sendKeys("Mashrufa@123");
	driver.findElement(By.name("remember")).click();
	driver.findElement(By.className("signinbtn")).click();	
}


@AfterMethod
public void tearDown() {
	
	driver.quit();
	
}}