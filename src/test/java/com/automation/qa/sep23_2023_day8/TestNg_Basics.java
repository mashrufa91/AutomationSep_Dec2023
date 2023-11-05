package com.automation.qa.sep23_2023_day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Basics {
	
//testNG can give very good report
	//it is a framework in itself
	//testNG also acts as an execution engine
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("before suite has earliest priority");	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("before suite has second priority");	
		
	}
	
	@BeforeClass
	
	public void beforeClass() {
			
			System.out.println("before method has third priority");	
			
		}	
	
	
	@BeforeMethod
	
public void beforeMethod() {
		
		System.out.println("before method has next priority");	
		
	}	
		
	@Test
	public void testCase1() {
	System.out.println("This is Test Case1 logic");
	}

	@Test
	public void testCase2() {
	System.out.println("This is Test Case2 logic");
	}

	@AfterMethod
	public void aftermethod() {
	System.out.println("Afterthod is the next annotation to execute");
	}

	@AfterClass
	public void afterclass() {
	System.out.println("AfterClass is the next annotation to execute");
	}

	@AfterTest
	public void aftertest() {
	System.out.println("AfterTest is the next annotation to execute");
	}

	@AfterSuite
	public void aftersuite() {
	System.out.println("AfterSuite is the next annotation to execute");
	
	
		


}}
