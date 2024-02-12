import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverWait wait;
		WebElement ele;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder
		// ='Username']"))).sendKeys("standard_user");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder
		// ='Password']"))).sendKeys("secret_sauce");

		ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.sendKeys("iphone15");

		ele = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		// storing the size of the links
		int i = links.size();

		// Printing the size of the string
		System.out.println(i);

		for (int j = 0; j < i; j++) {
			// Printing the links
			System.out.println(links.get(j).getText());
		}

		driver.get(
				"https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_3?crid=HSLM9NLV8JK1&keywords=iphone+15&qid=1704710620&sprefix=ipj%2Caps%2C289&sr=8-3");

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		//ele = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']']"));
	//	ele.click();

		// div[@class='a-section a-spacing-none
		// a-padding-none']//input[@id='add-to-cart-button']
		// Closing the browser
		driver.close();

		/*
		 * 
		 * String expectedtitle = "Swag Labs";
		 * 
		 * String actualTitle =
		 * driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		 * 
		 * Assert.assertEquals(expectedtitle, actualTitle);
		 * System.out.println(" im on login page");
		 * 
		 * ele = driver.findElement(By.xpath("//div[@class = 'inventory_item_name ']"));
		 * wait.until(ExpectedConditions.visibilityOf(ele)); List<WebElement>
		 * weballelement =
		 * ele.findElements(By.xpath("//div[@class = 'inventory_item_name ']"));
		 * 
		 * List<String> all_elements_text = new ArrayList<>();
		 * 
		 * for (int i = 0; i < weballelement.size(); i++) {
		 * all_elements_text.add(weballelement.get(i).getText());
		 * 
		 * String products = weballelement.get(i).getText();
		 * System.out.println(products);
		 * 
		 * } }
		 */

	}
}
