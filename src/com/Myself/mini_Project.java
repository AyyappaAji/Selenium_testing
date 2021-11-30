package com.Myself;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("http://automationpractice.com./index.php");
		WebElement fe = d.findElement(By.xpath("//a[@class = 'login']"));
		fe.click();
		WebElement fe1 = d.findElement(By.id("email"));
		fe1.sendKeys("ajithbabu902@gmail.com");
		WebElement fe2 = d.findElement(By.id("passwd"));
		fe2.sendKeys("indira2020#");
		WebElement fe3 = d.findElement(By.id("SubmitLogin"));
		fe3.click();

		WebElement fe4 = d.findElement(By.xpath("//a[@title = 'Home']"));
		fe4.click();
		WebElement fe6 = d.findElement(By.xpath("//img[@title = 'Blouse']"));
		fe6.click();
		Thread.sleep(5000);

		WebElement fe7 = d.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
		d.switchTo().frame(fe7);
		d.findElement(By.name("Submit")).click();
		d.switchTo().defaultContent();
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]")).click();
		d.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@type = 'checkbox']")).click();
		d.findElement(By.xpath("//button[@name = 'processCarrier']")).click();
		d.findElement(By.xpath("//a[@class = 'cheque']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("(//button[@type = 'submit'])[2]")).click();
		WebElement fe9 = d.findElement(By.xpath("//a[@title = 'Back to orders']"));
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("arguments[0].scrollIntoView();", fe9);
		j.executeScript("window.scrollBy(0,-500);");
		TakesScreenshot t =  (TakesScreenshot) d;
		File ss = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\screenshoot\\pic2.png");
		FileUtils.copyFile(ss, des);

   

	}

}
