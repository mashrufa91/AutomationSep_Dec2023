package com.automation.sep9_2023_day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class opening_multiple_tabs_in_same_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://amazon.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://google.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://flipkart.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://costco.com");
		
	
	}

}
