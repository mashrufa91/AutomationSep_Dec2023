package com.qa.automation.oct_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_pro_rules {

	@Test(dataProvider = "getData")
	public void loginTest(String username, String password, int emp_id, boolean promotion) {
		System.out.println(username + "---" + password + "---" + emp_id + "-----" + promotion);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4]; //rows and cols. Total rows are 3 and Total cols are 4
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 98765454;
		data[0][3] = true;
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 98765456;
		data[1][3] = true;
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 98765458;
		data[2][3] = false;
		
		return data;
		
	}
}
