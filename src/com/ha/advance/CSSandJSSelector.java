package com.ha.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSandJSSelector {

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
		
		
		// logout
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"li[data-bind='click: logout']\").click();");
		

	}

}
