package com.Myself;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("http://leafground.com/pages/table.html");
		drive.manage().window().maximize();
		System.out.println("------------------HEADER-------------------");
		List<WebElement> header = drive.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement webElement : header) {
			System.out.println(webElement.getText());
		}
			
		System.out.println("------------------row-----------------------");
		List<WebElement> row = drive.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement webElement2 : row) {
			System.out.println(webElement2.getText());
		}
	
		
		System.out.println("-------------------colom---------------------");	
		List<WebElement> colom = drive.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement webElement3 : colom) {
			System.out.println(webElement3.getText());
		}
			
		System.out.println("-------------------specific--------------------");
		WebElement sp = drive.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		
		System.out.println(sp.getText());
			
		}
			
		
		
			
		
	

}
