package com.automation.sep17_23_day6_validation_technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class More_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		WebElement moneylink = driver.findElement(By.linkText("Money"));
		WebElement BusinessEmail = driver.findElement(By.linkText("Business Email"));
		WebElement Shopping = driver.findElement(By.linkText("Shopping"));
		WebElement CreateAccount = driver.findElement(By.linkText("Create Account"));
		WebElement Signin = driver.findElement(By.linkText("Sign in"));
	}

}
