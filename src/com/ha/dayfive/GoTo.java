package com.ha.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.goto.com/meeting/");
		
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Wick");
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");
		
		driver.findElement(By.id("login__email")).sendKeys("john@gmail.com");

		Select selectCompanySize = new Select(driver.findElement(By.id("CompanySize")));
		selectCompanySize.selectByVisibleText("10 - 99");
		
		
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
		
		
	}

}
