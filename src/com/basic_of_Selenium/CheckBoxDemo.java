package com.basic_of_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		List <WebElement> list=driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		int size= list.size();
		
		for (int i=0; i<size;i++) {
			
			if (list.get(i).getAttribute("value").equalsIgnoreCase("Movies")) {
				
				list.get(i).click();
				
		}
			}
			
			/*int size= list.size();
			
			for (int i=0; i<size;i++) {
				
				list.get(i).click();
		}*/
		}
		
		
		
		
	}


