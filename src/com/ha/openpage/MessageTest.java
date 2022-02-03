package com.ha.openpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   // implicit wait for 20 seconds
		// implicit wait will applicable for all findElement and findElements
		
		
		driver.get("https://demo.openemr.io/b/openemr");

//        Method 1:		
//		WebElement username = driver.findElement(By.id("authUser"));
//		username.sendKeys("admin");
//		
//        Method 2:
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		WebElement langSelect = driver.findElement(By.name("languageChoice"));
		Select selectLang = new Select(langSelect);            // Select Dropdown 
		
		
		
		selectLang.selectByVisibleText("English (Indian)");  // visible Text is text  displayed in Web page
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//driver.close();  // close the browser
		
		
		
	}

}
