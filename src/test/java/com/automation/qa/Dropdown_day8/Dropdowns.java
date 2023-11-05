package com.automation.qa.Dropdown_day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
public Select select;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//select dropdowns
		//dynamic dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.name("reg_email__")).sendKeys("Selenium");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Selenium");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium");
		Select select= new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Apr");
		Select select1= new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("10");
		Select select2= new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1976");
		driver.findElement(By.name("")).click();
		
				
		//select class has three methods selectbyvisible text, select by index, select by value]
		//selectbyvisible text is preferable as others value might change
		
	}

}
