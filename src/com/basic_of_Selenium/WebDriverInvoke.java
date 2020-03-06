package com.basic_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().to("https://youtube.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
	    String actualTitle = driver.getTitle();
		 
		 System.out.println("The actual title of this page is : "+actualTitle);
		 
		 String expectedTitle ="Facebook - Log In or Sign Up";
		 

		 
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test passed");
			 
		 }
		else {
			
			System.out.println("Test Failed");
		}
		 
		
		driver.findElement(By.partialLinkText("https://www.facebook.com/recover/initiate?lwv=301&ars=royal_blue_bar")).click();;
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
		driver.close();
	}

}
