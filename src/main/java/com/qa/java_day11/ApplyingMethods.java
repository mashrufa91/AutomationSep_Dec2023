package com.qa.java_day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyingMethods {
	public static WebDriver driver;
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
       rediffLogin("https://rediff.com", "Mashrufa", "Mashrufa@123");
       tutorialNinjaRegistration ("https://tutorialsninja.com/demo","Mashrufa100", "Shanjia100","mashrufashanjia100@gmail.com", "9876543210", "Mashrufa@123", "Mashrufa@123");
	}

	public static void rediffLogin (String url, String username, String password) {
		driver= new ChromeDriver();
	
		driver.get(url);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.name("passwd")).sendKeys(password);
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.className("signinbtn")).click();		
	}
	public static void tutorialNinjaRegistration (String url, String FirstName, String LastName, String email, String telephone, String Password, String Confirm) {
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
driver.findElement(By.linkText("Register")).click();	
		
		driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys(FirstName);
		
		driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys(LastName);
		
		driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys(email);
		
		driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys(telephone);
		
		driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys(Confirm);

		driver.findElement(By.cssSelector("input[name=agree]")).click();
		
		driver.findElement(By.cssSelector("input[class=btn btn-primary]")).click();	
		
		
	}
	
	
}
