package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sellCar {
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
			
//	Call methods here		
			carSell();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void carSell() {
		
		try {
			jse = (JavascriptExecutor)driver;
			Thread.sleep(3000);
			
			
				driver.findElement(By.xpath("//span[contains(text(),'Sell A Car')]")).click();
				driver.findElement(By.cssSelector("div.main-container div.main-wrapper:nth-child(3) div.sell-car-container div.sell-car-hero div.container div.hero-options div.options-value div.get-started > span.text")).click();
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/img[1]")).click();
				driver.findElement(By.cssSelector("div.main-container div.main-wrapper:nth-child(3) div.sell-car-container div.sell-car-hero div.autochek-marketplace-container div:nth-child(2) div.autochek-marketplace-content div.about-your-car-container div.form-action > button.primary-button")).click();
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")).click();
				driver.findElement(By.cssSelector("div.main-container div.main-wrapper:nth-child(3) div.sell-car-container div.sell-car-hero div.autochek-marketplace-container div:nth-child(2) div.autochek-marketplace-content div.about-your-car-container div.form-action > button.primary-button")).click();
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'2021')]")).click();
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'Saloon')]")).click();
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("1000");
				
				jse.executeScript("window.scroll(0, 1000)");
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]")).click();
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]")).click();
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[1]/label[1]/span[1]")).click();
				
				driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'Abia')]")).click();
				
				driver.findElement(By.xpath("//button[contains(text(),'Finish')]")).click();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
			
			

			
	}
//	Methods are called here
	public static void main(String[] args) {
		sellCar obj = new sellCar();
		
		obj.invokeBrowser();
	}

}
