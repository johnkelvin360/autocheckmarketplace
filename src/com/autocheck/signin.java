package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {
	
	
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
				
//		Get url to be tested
				
				driver.get("https://marketplace.staging.myautochek.com/ng");
				
//		Call methods here		
				login();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
//	Users ability to login 
		
		public void login() {
			
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("john.kelvin@gmail.com");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Password1#");
			driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		}
		

		
		

	public static void main(String[] args) {
		signin obj = new signin();
		
		obj.invokeBrowser();
		}
	}

