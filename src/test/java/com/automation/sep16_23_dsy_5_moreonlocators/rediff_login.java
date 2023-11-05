package com.automation.sep16_23_dsy_5_moreonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();	
		
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("remember")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
	}

}
