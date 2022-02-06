package com.ha.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   // implicit wait for 20 seconds
		// implicit wait will applicable for all findElement and findElements
		
		
		driver.get("https://www.db4free.net/");
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
	
		
		List<String>  windows= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("Elon");
		driver.findElement(By.id("input_password")).sendKeys("pass@123");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("input_go")).click();
		
		
		

	}

}
