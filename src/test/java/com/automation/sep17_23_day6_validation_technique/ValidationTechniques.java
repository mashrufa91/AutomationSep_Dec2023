package com.automation.sep17_23_day6_validation_technique;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//at a webpage level there are three validation method
	//geTCurrentUrl()
	//getTitle()
	//getPageSource()
	
		
	//at a webElement level there are again 3 validation 	
		
		//isDisplayed
		//isEnabled()
		//isSelected
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://rediff.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("My landing page is correct");
		}else {
			System.out.println("My landing page is incorrect");
		}
		
		
		if(driver.getTitle().equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")
				&& driver.getCurrentUrl().equals("https://www.rediff.com/")) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("my landing page title and current url are incorrect");
		}
	}
	}
		
		
		
	


