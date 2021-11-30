 package com.Myself;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Elementmethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.google.com/");
		WebElement fe = drive.findElement(By.name("q"));
		fe.sendKeys("selenium");
		
		boolean dis = fe.isDisplayed();
		System.out.println(dis);
		
		boolean en = fe.isEnabled();
		System.out.println(en);
		
		boolean se = fe.isSelected();
		System.out.println(se);
		
		fe.clear();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
