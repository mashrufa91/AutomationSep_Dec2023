package com.qa.automation_Day12_oct_14_Assertion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAssignment {

	//valid crdential
	//invalid credential valid password
	//valid username invalid password
	//both invalid credentials
	//no credentials
	public WebDriver driver;
	

	@BeforeMethod
	public void setup() {
	driver= new ChromeDriver();
	driver.get("https://rediff.com/");
	driver.findElement(By.linkText("Sign in")).click();	}
	
	@Test
	
	public void loginWithValidCredentials() throws Exception {
		
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		driver.findElement(By.className("signinbtn")).click();
			
		
	}
	
	@Test
	
	public void loginWithInvalidUsername() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail100.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		driver.findElement(By.className("signinbtn")).click();
		
	}
	
	
	@Test
public void loginWthInvalidPassword() {	
	
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123456");

	driver.findElement(By.className("signinbtn")).click();
	
	}
	
	
	@Test
public void loginWithInvalidCredentials() {
  
  
   driver.findElement(By.className("signinbtn")).click();
   Alert alert = driver.switchTo().alert();
  String actualMessage =  alert.getText();
  String expectedAlertMessage ="Please enter a valid user name";
  Assert.assertEquals(actualMessage, expectedAlertMessage);
  alert.dismiss();
   }


	
@AfterMethod
public void tearDown() {
driver.quit();	
}
	
	
}
