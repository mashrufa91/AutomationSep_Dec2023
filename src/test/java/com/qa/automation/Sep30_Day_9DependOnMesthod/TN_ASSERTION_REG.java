package com.qa.automation.Sep30_Day_9DependOnMesthod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_ASSERTION_REG {

	WebDriver driver;
	@BeforeMethod
	public void opnApplctn() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
	}

	
	@Test 
	public void TNRegisterTest_mandatory_field() {
		
	
		
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
	@Test 
	public void lNRegisterTest_all_field() {
		
	
		
		driver.findElement(By.linkText("Register")).click();	
		
		driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
		
		driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
		
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");
		
		driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
		
		driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1).input")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		
		driver.findElement(By.cssSelector("input[class=btn btn-primary]")).click();	
		
	}
	
		
	
	//@Test(priority=3)
	public void verifyRegisterWithExistingEmail() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualDuplicateEmailWarning = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedDuplicateEmailWarning = "Warning: E-Mail Address is already registered!";
		Assert.assertTrue(actualDuplicateEmailWarning.contains(expectedDuplicateEmailWarning), "Then my assertion is incorrect");
		
		
		
	}
	@AfterMethod
	public void CloseBrowser() {
	driver.quit();}
}

	
	

