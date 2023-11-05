package com.qa.automation_day13_oc15_data_testing;

import org.testng.annotations.DataProvider;

public class Data_provider {

	@DataProvider(name="dataCheck")
	public void loginTest(String browsername, String username, String password, int phonenumber) {
		
	System.out.println(browsername+" "+username+" "+ password);	
		
		
	}
	
	
	
	
	
	@DataProvider(name="dataCheck")
	public Object[][] getData() {
		
	Object[][]data= new Object[3][4];
	data[0][0]="chrome";
	data[0][1]= "username1";
	data[0][2]="password";
	data[0][3]=9874561;
	
	Object[][]data1= new Object[3][4];
	data[0][0]="chrome";
	data[0][1]= "username1";
	data[0][2]="password";
	data[0][3]=9874561;
	return data;
	
	}
		
		
	
		
		
	
	
	
	
}
