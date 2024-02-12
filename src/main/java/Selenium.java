import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

	

	/*
	 * public Selenium(WebDriver driver) {
	 * 
	 * this.driver = driver; PageFactory.initElements(driver, this); }
	 */



	public static void main(String[] args)  {
		Logger log = Logger.getLogger(Selenium.class);
		WebDriver driver;
		// Selenium s = new Selenium(driver);

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		log.info("Openig Browser");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement onPage = driver.findElement(By.xpath("//div[@class ='category-cards']"));
		wait.until(ExpectedConditions.visibilityOf(onPage));

		log.info("cilck on the page");

		onPage.click(); // cliic on elemnts link

		// span[text()='Text Box']

		WebElement elementbox = driver.findElement(By.xpath("//div[@class='accordion']/div[1]/span/div"));
		wait.until(ExpectedConditions.visibilityOf(elementbox));
		// Thread.sleep(6000);
		elementbox.click();

		WebElement elementbox11 = driver.findElement(By.xpath("//span[text()='Text Box']"));
		wait.until(ExpectedConditions.visibilityOf(elementbox11));
		// Thread.sleep(6000);
		elementbox11.click();

		WebElement textBox = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		wait.until(ExpectedConditions.visibilityOf(textBox));
		textBox.sendKeys("Jitendra");

		driver.close();

		/*
		 * WebElement elementbox = driver.findElement(By.
		 * xpath("//*[text()='Elements']/preceding::div[@class='avatar mx-auto white']")
		 * ); wait.until(ExpectedConditions.visibilityOf(elementbox));
		 * Thread.sleep(6000); elementbox.click();
		 */
		/*
		 * try { WebElement textBoxbutton1 = driver .findElement(By.xpath(
		 * "//div[@class='accordion']/child::div[1]/child::span/div"));
		 * wait.until(ExpectedConditions.visibilityOf(textBoxbutton1));
		 * textBoxbutton1.sendKeys("Jitendra");
		 * 
		 * } catch (ElementNotInteractableException e) {
		 * 
		 * log.info("click on element"); }
		 */

		/*
		 * WebElement textBoxbutton =
		 * driver.findElement(By.xpath("//*[text()= 'Text Box']"));
		 * wait.until(ExpectedConditions.visibilityOf(textBoxbutton));
		 * textBoxbutton.sendKeys("Jitendra");
		 */

		// *[text()= 'Text Box']

	}

}
