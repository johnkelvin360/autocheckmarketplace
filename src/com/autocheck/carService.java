package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  

public class carService {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromewebdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
//	Get url to be tested
			
			driver.get("https://marketplace.staging.myautochek.com/ng");
			
//	Methods are called here
			scrollDown();
			scheduleCarService();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
public void scrollDown() {
		
		try {
			
			jse = (JavascriptExecutor)driver;
			Thread.sleep(3000);
			jse.executeScript("scroll(0, 300)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Pick a Service')]")).click();
			
			Thread.sleep(3000);
			jse.executeScript("scroll(0, -300)");
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

public void scheduleCarService() {
	
		try {
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]")).click();
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("John Kelvin");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("7059493969");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("john.kelvin@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]")).click();
	
			
			Select dropdown = new Select(driver.findElement(By.xpath("//body/[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]")));
			
			dropdown.selectByIndex(1);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
}
		
	public static void main(String[] args) {
		
		carService myobj = new carService();
		myobj.invokeBrowser();
		
	}

}
