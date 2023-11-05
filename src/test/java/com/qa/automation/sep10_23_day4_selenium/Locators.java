package com.qa.automation.sep10_23_day4_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// total 16 locators
		//we will learn 8 and just observe 5 =13
		//
		//8 most important locators
		
		//id
		//classname
		//xpath
		//css selector
		//linktext
		//partial linktext
		//tag name
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.get("https://rediff.com/");
		WebElement signinLink= 
				driver.findElement(By.className("signin"));
		signinLink.click();
		WebElement usernameTextBox =driver.findElement(By.id("login1"));
		usernameTextBox.sendKeys("seleniumpanda123@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Selenium@123");
           
		
		driver.findElement(By.className("signinbtn")).click();
		WebElement createAccountLink;
		WebElement moneylink;
		WebElement videoLink;
		
		WebElement shoppingLink;
		
	}

}
