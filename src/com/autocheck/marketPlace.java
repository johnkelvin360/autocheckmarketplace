package com.autocheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Note: Every function represents a test case
// The use of try/cache represents code lint in this case 

public class marketPlace {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
//	Ability to access browser with the given URL
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromewebdriver\\chromedriver.exe");
			
//	Instantiate the webdriver and manage driver properties
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
//		get url to be tested
			
			driver.get("https://marketplace.staging.myautochek.com/ng");
			
//			All other functions are called here
			scrollDown();
			navigateBrowser();
			searchCars();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
//	Check users ability to scroll up/down the page
	
	public void scrollDown() {

		try {
			
			jse = (JavascriptExecutor)driver;
			Thread.sleep(3000);
			jse.executeScript("scroll(0, 1000)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]")).click();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
		
	
//	Test users Ability to Navigate on the webpage
	
	public void navigateBrowser() {
		
		try {
			driver.navigate().to("https://marketplace.staging.myautochek.com/ng/cars-for-sale");
			Thread.sleep(3000);
			jse.executeScript("scroll(0, 1500)");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[3]/a[16]/div[1]/a[1]/div[1]/div[1]")).click();
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().to("https://marketplace.staging.myautochek.com/ng/sell-a-car");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Get started')]")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().to("https://marketplace.staging.myautochek.com/ng");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	Test search funtionality
	
	public void searchCars() {
		
		try {
			jse.executeScript("scroll(0, 300)");
			driver.findElement(By.cssSelector("div.main-container div.main-wrapper:nth-child(3) div.hero-container:nth-child(1) div.section-1 div.buy-car.hero-section div.section-content div.button-group > a.button.primary-button:nth-child(1)")).click();
			jse.executeScript("scroll(0, 300)");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/input[1]")).sendKeys("toyota");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/*[1]")).click();
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[3]/a[2]/div[1]/a[1]/div[1]/div[1]")).click();
			jse.executeScript("scroll(0, 300)");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
	
	public static void main(String[] args) {
	
//		Instantiate the class and call the function to invoke browser
	
		marketPlace obj = new marketPlace();
		obj.invokeBrowser();
		
	}

}
