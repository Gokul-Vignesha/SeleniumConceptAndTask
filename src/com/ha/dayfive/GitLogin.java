package com.ha.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://github.com/");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
