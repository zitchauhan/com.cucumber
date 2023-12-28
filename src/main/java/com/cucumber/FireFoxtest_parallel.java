package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxtest_parallel {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the firefox  Driver");
		WebDriverManager.firefoxdriver().setup();
		// Create FirefoxOptions and set the binary path if necessary
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:/Users/zitch/AppData/Local/Mozilla Firefox/firefox.exe"); // Uncomment and set if
																								// needed
		// Initialize the WebDriver instance
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
	}

	@Test
	public void chromeTestMethod() {

		// Initialize the chrome driver
		System.out.println("The thread ID for firefox is " + Thread.currentThread().getId());
	
		driver.get("http://www.google.com");
		//System.out.println(driver.getCurrentUrl());

		// driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[1]")).click();

	}
//looks good
	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser ");
		driver.close();
	}
}
