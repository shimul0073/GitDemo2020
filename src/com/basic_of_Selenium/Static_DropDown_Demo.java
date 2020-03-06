package com.basic_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDown_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath(""))
		
		/*Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(0);
		s.selectByValue("USD");
		s.selectByVisibleText("INR");*/
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		
	}

}
