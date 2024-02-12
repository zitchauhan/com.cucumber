import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchb {
	



	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait wait;
		WebElement ele;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Username']")))
				.sendKeys("standard_user");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Password']")))
				.sendKeys("secret_sauce");

		ele = driver.findElement(By.xpath("//input[@id='login-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		String expectedtitle = "Swag Labs";

		String actualTitle = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();

		Assert.assertEquals(expectedtitle, actualTitle);
		System.out.println(" im on login page");

		ele = driver.findElement(By.xpath("//div[@class = 'inventory_item_name ']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		List<WebElement> weballelement = ele.findElements(By.xpath("//div[@class = 'inventory_item_name ']"));

		List<String> all_elements_text = new ArrayList<>();

		for (int i = 0; i < weballelement.size(); i++) {
			all_elements_text.add(weballelement.get(i).getText());

			String products = weballelement.get(i).getText();
			System.out.println(products);

			

		}
		
		System.out.println("-------------------------");
		List<WebElement> mylist = driver.findElements(By.xpath("//div[@class = 'inventory_item_name ']"));
		
		for( WebElement wb : mylist) {
			
		System.out.println(wb.getText());
		String s = "Sauce Labs Backpack";
		if ( wb.getText() == s) {
			

		}
		//System.out.println(wb.getTagName());
		}

		
		
		

		// inventory_container

		// type="submit"

		/*
		 * //driver.findElement(By.xpath( "//input[@placeholder ='Username']")).click();
		 * 
		 * //driver.findElement(By.xpath( "//input[@placeholder ='Password']")).click();
		 */

	}

}
