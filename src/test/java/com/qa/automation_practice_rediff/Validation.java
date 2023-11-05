package com.qa.automation_practice_rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://rediff.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

if (driver.getTitle().equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")
		&& driver.getCurrentUrl().equals("https://www.rediff.com/")) {
driver.findElement(By.className("signin")).click();		
}else {
System.out.println("My landing page and title is incorrect");
}

}
}