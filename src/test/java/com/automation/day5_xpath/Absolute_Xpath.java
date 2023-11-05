package com.automation.day5_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class= 'btn btn-primary']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
