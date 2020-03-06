package com.basic_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Actions a = new Actions(driver);
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("i love you").doubleClick().perform();;
		//a.moveToElement(text).keyDown(Keys.ENTER).build().perform();
		a.click(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
	}

}
