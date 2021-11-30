package com.Myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://leafground.com/pages/Alert.html");
		WebElement fe = d.findElement(By.xpath("//button[@onclick = 'normalAlert()']"));
		fe.click();
		Thread.sleep(5000);
		d.switchTo().alert().getText();
		
		d.switchTo().alert().accept();
		WebElement fe1 = d.findElement(By.xpath("//button[@onclick = 'confirmAlert()']"));
		fe1.click();
		d.switchTo().alert().dismiss();
		
		WebElement fe2 = d.findElement(By.xpath("//button[@onclick = 'confirmPrompt()']"));
		fe2.click();
		Thread.sleep(5000);
		d.switchTo().alert().sendKeys("my name is ajith ayyappa");
		
		
	}
 
}
