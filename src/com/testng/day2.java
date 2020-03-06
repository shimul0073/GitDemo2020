package com.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void ploan() {
		
		System.out.println("good");
	}
	
	@BeforeTest
	
	public void prerequiste() {
		System.out.println("I will execute first");
	}
	
	@Test(dataProvider="getData")
	public void annotion(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= new Object[3][2];
		
		data[0][0]="firstsetusername";
		data[0][1]="secondpassword";
		

		data[1][0]="firstsetusername";
		data[1][1]="secondpassword";
		

		data[2][0]="firstsetusername";
		data[2][1]="secondpassword";
		return data;
	}
	
	
}
