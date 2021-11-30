package com.Myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		drive.get("https://www.facebook.com/");
		WebElement fe = drive.findElement(By.xpath("//a[@rel = 'async']"));
		fe.click();
		Thread.sleep(5000);
		WebElement fe1 = drive.findElement(By.xpath("(//input[@type = 'text'])[2]"));
		fe1.sendKeys("AYYAPPA");
		Thread.sleep(5000);
		WebElement fe2 = drive.findElement(By.xpath("(//input[@type = 'text'])[3]"));
		fe2.sendKeys("AJITH");
		Thread.sleep(5000);
		WebElement fe3 = drive.findElement(By.xpath("(//input[@type = 'text'])[4]"));
		fe3.sendKeys("8838543538");
		Thread.sleep(5000);
		WebElement fe4 = drive.findElement(By.xpath("(//input[@type = 'password'])[2]"));
		fe4.sendKeys("12345678");
		WebElement fe5 = drive.findElement(By.id("day"));
		Select s = new Select(fe5);		
		s.selectByValue("30");
		WebElement fe6 = drive.findElement(By.id("month"));
		Select s1 = new Select(fe6);
		s1.selectByIndex(7);
		WebElement fe7 = drive.findElement(By.id("year"));
		Select s2 = new Select(fe7);
		s2.selectByValue("1999");
		WebElement fe8 = drive.findElement(By.xpath("//"));
	}

	

}
