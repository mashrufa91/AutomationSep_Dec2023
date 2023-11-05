package com.automation.sep16_23_dsy_5_moreonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialsninja_register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");

		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Mashrufa100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Shanjia100");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("mashrufashanjia100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Mashrufa@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Mashrufa@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        driver.findElement(By.linkText("Logout")).click();
      
      
        
        
      
	}

		
	}


