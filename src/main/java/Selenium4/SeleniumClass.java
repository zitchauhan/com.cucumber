package Selenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass {

	@Test
	private void seleniumEasy() throws InterruptedException {
		WebElement element = null;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	

		element = driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
		wait.until(ExpectedConditions.visibilityOf(element));

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].scrollIntoView(true);", element);

		element.click();
		
		element = driver.findElement(By.xpath("//div [@class='list-group']/a[text() = 'Simple Form Demo']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();  // click on sample daemo
		
		element = driver.findElement(By.xpath("//input[@id='user-message']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("jite");   // enter input 
		
		String text = element.getText();  // get input text 
		System.out.println(text);
		
		element = driver.findElement(By.xpath("//button[contains(text() , 'Show Message')]"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();  //  click on show massage ;
		
		Actions action = new Actions(driver);
		element = driver.findElement(By.xpath("//button[contains(text() , 'Show Message')]"));
		action.doubleClick(element).perform();   // double click on eleemnt;
		
		element = driver.findElement(By.xpath("//span[@id='display']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		String actual = element.getText();
		Thread.sleep(2000);
		Assert.assertEquals(text, actual);
		
		
		

	}

}
