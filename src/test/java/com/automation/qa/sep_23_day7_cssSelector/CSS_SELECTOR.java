package com.automation.qa.sep_23_day7_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SELECTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
	driver.findElement(By.partialLinkText("Sign")).click();

driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("Mashrufa");
driver.findElement(By.name("input[id=passwd]")).sendKeys("Mashrufa@123");
driver.findElement(By.name("remember")).click();
driver.findElement(By.className("signinbtn")).click();
}



		
		
		
	
}
