package com.basic_of_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='countries']"));
		
		Select s = new Select(element);
		/*//s.selectByIndex(11);
		s.selectByValue("Bangladesh");*/
		
		WebElement e= s.getFirstSelectedOption();
		
		System.out.println(e.getText());
		
		
		/*List<WebElement> list= s.getOptions();
		
		
		
		int size=list.size();
		for (int i=0; i<size;i++) {
			
			String text=list.get(i).getText();
			
			if(text.contains("Bangladesh")){
				
				list.get(i).click();
				break;
			}
		
		for (WebElement e : list) {
			
			String text=e.getText();
			
			if (text.equalsIgnoreCase("Australia")) {
				
				e.click();
				break;
			}*/
		}
		}
	


