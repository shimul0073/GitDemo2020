package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeClass
	public void BfClass() {
		System.out.println("Before class.....");
	}
	@AfterClass
	public void AfClass() {
		System.out.println("After class.....");
	}

	@AfterTest
	
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	
	@Test(groups= {"Smoke"})
	
	public void demo() {
		
		System.out.println("Hello selenium");
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("I am the no 1 from the last");
	}
	@Parameters({ "URL" })
	@Test
	public void SecondTest(String uname) {
		System.out.println("Bye");
		System.out.println(uname);
	}
}
