package com.qa.automation.day2_sep_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); //contl+shift+O
driver.manage().window().maximize();
driver.get("https://rediff.com");
driver.findElement(By.className("signin")).click();
driver.quit();





WebDriver driver2= new EdgeDriver();

driver2.manage().window().maximize();
driver2.get("https://tutorialsninja/demo.com");

driver2.quit();



	}

}
