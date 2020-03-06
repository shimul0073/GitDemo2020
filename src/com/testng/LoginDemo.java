package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class LoginDemo {
	
	public WebDriver driver=null;
	
	public void Login() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\cool\\eclipse-workspace_ClassPromod\\SeleniumClass\\src\\com\\testng\\datadriven.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").contains("chrome"))
				{
			driver= new ChromeDriver();
		} else if(prop.getProperty("browser").contains("firefox")){
			
			driver= new FirefoxDriver();
		} else {
			driver= new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}

}
