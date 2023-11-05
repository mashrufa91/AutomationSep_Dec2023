package com.automation.qa.sep_23_day7_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tn_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo");

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();	
		//driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Mashrufa10");
		driver.findElement(By.cssSelector("input[id^=input-l]")).sendKeys("Shanjia100");
		driver.findElement(By.cssSelector("input[id$=-email]")).sendKeys("mashrufashanjia@yahoo.com");
	
		driver.findElement(By.cssSelector("input[name*= telephone ]")).sendKeys("1234356667");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Mashrufa@123");
		driver.findElement(By.cssSelector("div#account-register>div>div>form>fieldset+fieldset+fieldset>div>div>label:nth-child(1)>input"
		)).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	

}
