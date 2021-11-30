package com.Myself;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://www.google.co.in/");
		WebElement fe = dri.findElement(By.xpath("//a[text() = 'Gmail']"));
		Actions ac = new Actions(dri);
		ac.moveToElement(fe).build().perform();
		fe.click();
		
//		automatic keyboard action
		
//		Robot r = new Robot();
//		r.keyPress
		
		
	}

}
 