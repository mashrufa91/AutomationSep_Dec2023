package com.qa.automation.sep10_23_day4_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();	
		
		driver.findElement(By.id("login1")).sendKeys("selenium@rediff.com");
		driver.findElement(By.id("password")).sendKeys("selenium123");
		driver.findElement(By.name("remember")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remember")).click();
		
	}

}
