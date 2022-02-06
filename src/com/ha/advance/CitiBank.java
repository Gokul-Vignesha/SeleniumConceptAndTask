package com.ha.advance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   // implicit wait for 20 seconds
		// implicit wait will applicable for all findElement and findElements
		
		
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
	
		
		List<String>  windows= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));

		driver.findElement(By.linkText("Travel")).click();
		
		
		
	}

}
