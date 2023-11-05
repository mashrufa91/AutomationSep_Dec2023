package com.qa.automation_practice_rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_create_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
	driver.get("https://rediff.com/");
		
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Shanjia");
		driver.findElement(By.xpath("//input[starts-with(@name, 'login')]")).sendKeys("Mashrufa");
		driver.findElement(By.className("btn_checkavail")).click();
		driver.findElement(By.id("newpasswd")).sendKeys("Mashrufa123");
		driver.findElement(By.id("newpasswd1")).sendKeys("Mashrufa123");
		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys("Mashrufa1234");
		driver.findElement(By.id("mobno")).sendKeys("123456789");
	
		
		
		
		
		
		
		
		
		
		
	}

}


