package com.basic_of_Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_file_Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\cool\\eclipse-workspace_ClassPromod\\SeleniumUdemy\\Login.properties");
		
		Properties p = new Properties();
		p.load(fis);
		WebDriver driver = new ChromeDriver();
		
		driver.get(p.getProperty("URL"));
		driver.findElement(By.xpath(p.getProperty("uname.xpath"))).sendKeys(p.getProperty("uname"));
		driver.findElement(By.xpath(p.getProperty("pwd.xpath"))).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.xpath(p.getProperty("login.xpath"))).click();
		
	}

}
