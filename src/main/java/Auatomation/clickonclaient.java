package Auatomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickonclaient {

	static WebElement ele;
	static WebDriverWait wait;
	static WebDriverWait wait1;

	@Test(enabled = true)
	// @Test
	public static void main() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://iapw-acf-d-qa1-ax360-1000.web.app/en/");

		ele = driver.findElement(By.xpath("//a[contains(text()  ,'Login using email & password')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ele = driver.findElement(By.xpath("//input[@id = 'username']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester@mvp.com");

		ele = driver.findElement(By.xpath("//input[@id = 'password']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("qtester");

		ele = driver.findElement(By.xpath("//button[contains(text()  ,'Sign In')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//p[contains(text(),'Notifications')]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.click();
	

		ele = driver.findElement(By.xpath("(//p[contains(text(),'Clients')])[1]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.click();


		List<WebElement> clientss = driver
				.findElements(By.xpath("//div[@class='looker-cell' ]/child::span/child::span/a"));

		wait.until(ExpectedConditions.visibilityOfAllElements(clientss));

		for (int i = 0; i < clientss.size(); i++)

		{

			WebElement we = clientss.get(i);

			if (we.getText() == clientss.get(i).getText())

			{

				we.click();
				driver.navigate().back();

			}

		}

	}// Assert.assertEquals(false, null)

}
