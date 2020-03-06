package com.basic_of_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Log In")).click();
		System.out.println( " Before switching ");
		System.out.println(driver.getTitle());
		Set <String> ids=driver.getWindowHandles();
	Iterator<String> it =ids.iterator();
	String parentid=it.next();
	String childid= it.next();
	driver.switchTo().window(childid);
	System.out.println("After switching");
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
		

	}

}
