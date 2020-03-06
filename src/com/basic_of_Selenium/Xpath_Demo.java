package com.basic_of_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" I love you shimul");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys(" i am a good person");
		driver.findElement(By.xpath("//div[@jsname='RNNXgb']/div/div[2]/input")).sendKeys("i like you dear friend");
    
		//div[@class='ABSBwf']
		//div[@jscontroller='mvYTse']/div/input
		//driver.findElement(By.xpath("//div[@jscontroller='mvYTse']/div/input")).click();
		
		driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		
	}

}
