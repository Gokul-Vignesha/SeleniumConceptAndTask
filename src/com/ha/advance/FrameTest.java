package com.ha.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		// //frame -gives no. of. frames in page 
		// Switch to frame using name attribute
		driver.switchTo().frame(driver.findElement(By.name("login_page")));

		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		
		driver.findElement(By.id("fldPasswordDispId")).sendKeys("pass@123");
		
		driver.findElement(By.xpath("//a[text()='Forgot Password / IPIN']")).click();
		
		
		driver.findElement(By.xpath("//img[@alt=\"Go\"]")).click();
		
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		//driver.switchTo().defaultContent(); // get back to default page 
		
		
	}

}
