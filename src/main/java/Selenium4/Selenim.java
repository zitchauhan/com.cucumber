package Selenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenim {

	
	public static void main(String[] args) {
		
	
	WebDriver driver;
	WebDriverWait wait;
	WebElement ele;

	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.manage().window().maximize();
	//driver.get("https://www.saucedemo.com");
	
	 //navigates to url
	 driver.get("https://www.selenium.dev/selenium/web/inputs.html");

	 //returns TagName of the element
	 String value = driver.findElement(By.name("email_input")).getTagName();
	 System.out.println(value);
	  

		/*
		 * wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//input[@placeholder ='Username']"))) .sendKeys("standard_user");
		 * 
		 * 
		 * //navigates to url
		 * driver.get("https://www.selenium.dev/selenium/web/inputs.html");
		 * 
		 * //returns TagName of the element String value =
		 * driver.findElement(By.name("email_input")).getTagName();
		 */	}  
	
}
