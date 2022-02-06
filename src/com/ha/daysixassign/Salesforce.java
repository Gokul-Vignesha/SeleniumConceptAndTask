package com.ha.daysixassign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		

		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("Wick");
		
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Google");
		
		// Select Job Title from dropdown
		Select jobTitle = new Select(driver.findElement(By.name("UserTitle")));
		jobTitle.selectByVisibleText("IT Manager");
		
	
////		driver.findElement(By.xpath("//input[@name=\"SubscriptionAgreement\"]")).click();
		
		// Select Employee Size from dropdown
		Select companyCountry= new Select(driver.findElement(By.name("CompanyCountry")));
		companyCountry.selectByValue("US");
		
		Select selectState = new Select(driver.findElement(By.name("CompanyState")));
		selectState.selectByVisibleText("New York");
		
		Thread.sleep(4000);
		
//		driver.findElement(By.id("SubscriptionAgreement")).click();
		driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
		
		
		driver.findElement(By.xpath("//button[contains(text(),\"start my free trial\")]")).click();
		
		String phoneErrorMsg = driver.findElement(By.xpath("//span[contains(text(),\"Enter a valid phone number\")]")).getText();
		System.out.println(phoneErrorMsg);
		
		Thread.sleep(5000);
		
		driver.quit();
	
		
	}

}
