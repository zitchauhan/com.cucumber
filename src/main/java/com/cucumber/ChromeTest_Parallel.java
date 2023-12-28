package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest_Parallel {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Google Chrome Driver");
		WebDriverManager.chromedriver().setup();
		// Initialize the chrome driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	@Test
	public void chromeTestMethod() {

		System.out.println("The thread ID for chorome is " + Thread.currentThread().getId());
		driver.get("http://www.google.com");

		// driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]")).click();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser ");
		driver.close();
	}
}
