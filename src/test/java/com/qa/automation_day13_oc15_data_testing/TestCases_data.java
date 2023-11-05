package com.qa.automation_day13_oc15_data_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases_data {
	
	public static Properties prop;
	public static void main(String[] args) throws Exception {
	
		
		
		prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\automation_day13_oc15_data_testing\\config.properties");
		
	prop.load(ip);
	readFromPropertiesfile();
	}
	
	
	public static void readFromPropertiesfile() {
	
	
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));


	driver.findElement(By.linkText("Sign in")).click();	
	
	
	driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validusername"));
	driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
	
	
	driver.findElement(By.className("signinbtn")).click();
	driver.findElement(By.className("rd_logout")).click();
}
}