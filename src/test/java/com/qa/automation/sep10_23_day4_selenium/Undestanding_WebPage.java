package com.qa.automation.sep10_23_day4_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Undestanding_WebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		
		//WebElement signinLink = driver.findElement(By.className("signin"));
		//signinLink.click();
		
		//WebElement usernameTextBox = driver.findElement(By.id("login1"));
		//usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		
		//WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		//passwordTextBox.sendKeys("Selenium@123");
		
		//WebElement loginButton = driver.findElement(By.className("signinbtn"));
		//loginButton.click();
		
		//WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		//logoutLink.click();
		
		//driver.findElement(By.className("signin")).click();
		//driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		//driver.findElement(By.className("signinbtn")).click();
		//driver.findElement(By.className("rd_logout")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Mashrufa Shanjia");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("mashrufashanjia545");
		driver.findElement(By.xpath("//input[@class='btn_checkavail']")).click();
		
		
		driver.findElement(By.xpath("//input[contains(@id, 'newpasswd')]")).sendKeys("Mashrufa@123");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Mashrufa@123");
		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys("mashrufa@rediffmail.com	");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9876543210");
		
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'gender')][@value = 'f']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='captcha']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='Register']")).click();
	}

}
