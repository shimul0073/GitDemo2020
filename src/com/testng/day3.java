package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebloginCarLoan() {
		System.out.println("weblogincar");
	}
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}
	@Test
	public void MobileloginCarLoan() {
		System.out.println("Mobilelogincar");
	}
	@BeforeMethod
	public void Bfmethod() {
		System.out.println(" I will execute before every test method  in day 3 class");
	}
	
	@Test(dependsOnGroups= {"Smoke"})
	public void APICarLoan() {
		System.out.println("LoginAPIcar");
	}
	
	@AfterMethod(groups= {"Smoke"})
	public void Afclass() {
		System.out.println("I will execute after every test method in day3 class");
	}
	@Test(groups= {"Smoke"})
	public void MobilesignincarLoan() {
		System.out.println("Mobile SignIn");
	}
	
	@Test 
	public void MobilesignOutcarLoan() {
		System.out.println("Mobile SignOut");
	}
}
