package com.qa.automation.sep10_23_day4_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_howSeleniumWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//every lptop is a client
		//u wite selenium code wit oop language of ur choice in the client
	//this code interects with the server of the application u want to use
		// the application is in form of website
		//so to interect with application u need a browser
		//sel oop lang code interect with driver of that browser wich in turn interect with the browder

		//finall we see the outcome in the browser as ui
		//selenium is api library
		
		
		
		
	//chrome driver is part of selenium library	
	//we import librarys to validate our logic
	
		//driver is the reference of that interface driver
		//we can write any name instead of driver
		//user defined classes versus predefined classes (cannot be changed)
		
		
	WebDriver driver = new ChromeDriver (); 	
	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	driver.get("https://amazon.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("htpps://makemytrip.com");
	driver.quit();
		
		
	}

}
