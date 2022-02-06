package com.ha.daysixassign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoEMRMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.cssSelector("[name='authUser']")).sendKeys("admin");
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");
		
		WebElement langSelect = driver.findElement(By.cssSelector("[name='languageChoice']"));
		Select selectLang = new Select(langSelect);            // Select Dropdown 
		
		
		
		selectLang.selectByVisibleText("English (Indian)");  // visible Text is text  displayed in Web page
		
		//driver.findElement(By.cssSelector(".btn btn-login btn-lg"));   --*** have to check using class
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"Messages\"]")).click();
		
		//Switching to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"msg\"]")));
		
		
		driver.findElement(By.partialLinkText("Add New")).click();
		
		driver.findElement(By.id("note")).sendKeys("Hello, Entering Message Using Automation !!! ");
		
		Select selectType = new Select(driver.findElement(By.id("form_note_type")));
		selectType.selectByVisibleText("Pharmacy");
		
		Select selectStatus = new Select(driver.findElement(By.id("form_message_status")));
		selectStatus.selectByValue("New");
		
		Select selectUsers = new Select(driver.findElement(By.id("users")));
		selectUsers.selectByIndex(1);
		
		
		driver.findElement(By.id("newnote")).click();
		
		System.out.println("Printing Error Message : " + driver.findElement(By.id("error_reply_to")).getText());
		
		
	}

}
