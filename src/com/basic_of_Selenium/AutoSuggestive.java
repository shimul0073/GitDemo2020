package com.basic_of_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
	}

}
