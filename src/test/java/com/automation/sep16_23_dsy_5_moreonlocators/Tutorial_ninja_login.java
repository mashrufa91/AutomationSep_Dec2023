package com.automation.sep16_23_dsy_5_moreonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial_ninja_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
		driver.findElement(By.partialLinkText("Lo")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

}
}