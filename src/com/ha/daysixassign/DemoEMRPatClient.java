package com.ha.daysixassign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoEMRPatClient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("http://demo.openemr.io/b/openemr/");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		WebElement langSelect = driver.findElement(By.name("languageChoice"));
		Select selectLang = new Select(langSelect);            // Select Dropdown 
		
		
		
		selectLang.selectByVisibleText("English (Indian)");  // visible Text is text  displayed in Web page
		
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"Patient/Client\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Patients\"]")).click();
		
		
		
		// Entering Create Patient frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"fin\"]")));
		
		driver.findElement(By.id("create_patient_btn1")).click();

		driver.switchTo().defaultContent();
		
		
		// Entering Patient Details frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"pat\"]")));
		
		driver.findElement(By.name("form_fname")).sendKeys("Scooby");
		driver.findElement(By.id("form_lname")).sendKeys("Doo");
		driver.findElement(By.id("form_DOB")).sendKeys("2022-02-06");
		
		Select selectGender = new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");
		
		driver.findElement(By.id("create")).click();
		
		driver.switchTo().defaultContent();
			
		
		// Entering Modal frame
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		String createPatientAlert = driver.switchTo().alert().getText();
		System.out.println(createPatientAlert);
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//div[@class=\"closeDlgIframe\"]")).click();
		
		System.out.print("\n \n Printing Patient Name : ");
		
		String pName = driver.findElement(By.xpath("//span[@data-bind=\"text: pname()\"]")).getText();
		System.out.println(pName);
		
		
		driver.quit();

	}

}
