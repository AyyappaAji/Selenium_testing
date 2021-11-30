package com.Myself;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_drivermethods {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.google.com/");
		drive.manage().window().maximize();
		String title = drive.getTitle();
		System.out.println(title);
		String url = drive.getCurrentUrl();
		System.out.println(url);
		
		
//		navigation methods
		
		drive.navigate().to("https://www.youtube.com/");
		drive.navigate().back();
		drive.navigate().forward();
		drive.navigate().refresh();
		Thread.sleep(5000);
		drive.quit();		
	}

}
