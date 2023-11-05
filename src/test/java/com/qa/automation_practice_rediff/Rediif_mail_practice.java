package com.qa.automation_practice_rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediif_mail_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://rediff.com");
			driver.findElement(By.partialLinkText("Sign")).click();

		driver.findElement(By.id("login1")).sendKeys("Mashrufa");
		driver.findElement(By.name("passwd")).sendKeys("Mashrufa@123");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.className("signinbtn")).click();
	}

}
