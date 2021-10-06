package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp {
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
			
//			scrollDown();
			register();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
//	public void scrollDown() {
//
//		try {
//			
//			jse = (JavascriptExecutor)driver;
//			Thread.sleep(3000);
//			
//			Thread.sleep(3000);
//			
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	public void register() {
		
		try {
			
			driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 300)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("John");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Kelvin");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("john.Kelvin@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("7059493929");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("Password1#");
			driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public static void main(String[] args) {
		
		signUp obj = new signUp();
		obj.invokeBrowser();
		
	

	}

}
