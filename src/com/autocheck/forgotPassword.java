package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotPassword {

	WebDriver driver;
	JavascriptExecutor jse;
	

	public void invokeBrowser() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromewebdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
//	Get url to be tested
			
			driver.get("https://marketplace.staging.myautochek.com/ng");
// Call Method here
			forgotpassword();
	}
	
//	Test users ability to retrieve forgotten password
	
	public void forgotpassword() {
		try {
			jse = (JavascriptExecutor)driver;
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			jse.executeScript("scroll(0, 800)");
			driver.findElement(By.xpath("//p[contains(text(),'Forgot Password?')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("john.kelvin@gmail.com");
			driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
			

			driver.close();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		forgotPassword obj = new forgotPassword();
		obj.invokeBrowser();
		

	}

}
