package com.qa.automation_practice_rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax 1 //html[@attribute = 'valueofthatattribute’]
	
		//driver.findElement(By.xpath("//*[@id='username']"));
		
		//Syntax 2 html[@attribute1 = 'value1' and @attribute2 = 'value2’]
		
		//syntax 3 html[@attribute1 = 'value1' or @attribute2 = 'value2’]
		
		//input[@id='login1'and @name='login']
		//Syntax 4 //html[text()='value']//link
		
		//Syntax5   //html[contains(@attribute, 'value')]
//Syntaxt 6   
		
		
		//html[contains(text(), 'contentofthetext')]
		
		//synax 7 
	//	html[contains(@attribute, 'value')]
		
		//html[starts-with(@attribute,'value')]"));

		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
	driver.findElement(By.linkText("Create Account")).click();	
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.partialLinkText("Sign")).click();
driver.findElement(By.xpath("//a[text()='Sign in']")).click();
driver.findElement(By.id("login1")).sendKeys("Ahmed");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ahmad123@");
driver.findElement(By.className("signinbtn")).click();
		
	// xpath("//input[@id='password']
// //html[starts-with(@name,'name']
//name= 'class_error_id'
//attribute- name, id, class

//  //input[contains(@id, 'password123')]
//input[starts-with(@class,'password')]

// //input[starts-with(@name, 'login')]
//driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("Mashrufa123");
	//driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Mashrufa@123");	
	//driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Mashrufa123");
	}

}
