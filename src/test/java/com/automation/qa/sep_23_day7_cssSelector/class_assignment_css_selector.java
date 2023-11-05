package com.automation.qa.sep_23_day7_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_assignment_css_selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	
public static void rediffLoginAndou() {
	
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	
	driver.get("https://rediff.com/");
	driver.findElement(By.linkText("Sign in")).click();	
	
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.remember")).click();

	driver.findElement(By.cssSelector("input.signinbtn")).click();
	driver.findElement(By.cssSelector("a.rd_logout")).click();	
	
}	
	
public static void tnloginlogout() {

	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	
	driver.findElement(By.linkText("Login")).click();
	
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("selenium123");

}

	

	
	
public static void tnRegisterAndAcknowledge(){
	
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	
	driver.get("https://tutorialsninja.com/demo");

	driver.findElement(By.linkText("My Account")).click();
	
	driver.findElement(By.linkText("Register")).click();	
	
	driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Mashrufa100");
	
	driver.findElement(By.cssSelector("input[id=input-lastname]")).sendKeys("Shanjia100");
	
	driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys("mashrufashanjia100@gmail.com");
	
	driver.findElement(By.cssSelector("input[id=input-telephone]")).sendKeys("9876543210");
	
	driver.findElement(By.cssSelector("input[id=input-password]")).sendKeys("Mashrufa@123");
	
	driver.findElement(By.cssSelector("input[id=input-confirm]")).sendKeys("Mashrufa@123");
	
	driver.findElement(By.cssSelector("input.agree")).click();
	
	driver.findElement(By.cssSelector("input.btn.btn-primary]")).click();
    
  	
	
}

}
