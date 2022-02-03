package com.ha.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nasscom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://nasscom.in/");

		driver.findElement(By.partialLinkText("New User")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("admin");     // Entering Users FirstName
		driver.findElement(By.id("edit-field-lname")).sendKeys("pass");          // Entering Users LastName 
		driver.findElement(By.id("edit-mail")).sendKeys("admin@gmail.com"); 
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");
		
		
		// Business focus dropdown 
		WebElement bussinessFocus = driver.findElement(By.id("edit-field-business-focus-reg"));
		Select selectBussinessFocus = new Select(bussinessFocus);
		
		selectBussinessFocus.selectByValue("51");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-submit--2")).click();
		
	
		//driver.quit();

	}

}
