package com.automation.qa.testngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_BASICS_TN {

	private static final String[] Register = null;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
	
		
	}
	
	@Test (priority=1)
	public void Register () {
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mashrufa100");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Shanjia100");
		driver.findElement(By.id("input-email")).sendKeys("mashrufashanjia100000@gmail.com");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("123456788");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("123456788");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualMessage = driver.findElement(By.xpath("//div[@id='content']/p[1]")).getText();
		String Expectedmessage = "Congratulations! Your new account has been successfully created!";
		//Assert.assertTrue(actualMessage.contains(Expectedmessage));
		
			Assert.assertEquals(actualMessage, Expectedmessage);
	}
	
	
	@Test (priority=2, dependsOnMethods= "Register", enabled=false)
	public void login () {
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mashrufashanjia100@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue((driver.findElement(By.linkText("View your order history")).isDisplayed()));
		
		
		
	}
	
	
	@Test (priority= 3, dependsOnMethods= {"Register", "login"}, alwaysRun=true)
	public void logout () {
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("mashrufashanjia100@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.linkText("Logout")).click();
	
	
	}
	
}
