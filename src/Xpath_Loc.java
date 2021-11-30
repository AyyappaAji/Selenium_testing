import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Loc {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\aji\\chromedriver.exe"); 
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com/");
		WebElement fe = drive.findElement(By.xpath("//input[@type = 'text']"));
		fe.sendKeys("ajithbabu902@gmail.com");
		WebElement fi = drive.findElement(By.xpath("//input[@type = 'password']"));
		fi.sendKeys("Indira2020#");
		Thread.sleep(5000);
		WebElement fi1 = drive.findElement(By.xpath("//button[@value = '1']"));
		fi1.click();
		
		drive.manage().window().maximize();
		
		Thread.sleep(10000);
		
		TakesScreenshot ts = (TakesScreenshot) drive;
	    File ss = ts.getScreenshotAs(OutputType.FILE);
	    File de = new File("C:\\Users\\babu1\\eclipse-workspace\\Selinium_testing\\screenshoot\\pic.png");
	    FileUtils.copyFile(ss, de);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
