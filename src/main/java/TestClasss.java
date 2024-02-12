import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClasss {

	static WebDriver driver;
	static WebDriverWait wait;
	static WebElement ele;

	static ExpectedConditions watingElemnt;

	@BeforeTest
	void launchBrowsew() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

	}

	@Test
	void findthelistofEmemnets() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@jsname='yZiJbe']")))
				.sendKeys("selenium");

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[ starts-with( text() , 'selenium') ]")));

		List<WebElement> mylist = driver.findElements(By.xpath("//span[ starts-with( text() , 'selenium') ]"));

		for (WebElement my : mylist) {

			System.out.println(my.getText());
		}

		for (int i = 0; i < mylist.size(); i++) {

			System.out.println(mylist.get(i).getText());

		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@jsname='yZiJbe']"))).clear();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@jsname='yZiJbe']")))
				.sendKeys("amazon");

		/// /html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]

		ele = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/descendant::input[1]"));
		wait.until(ExpectedConditions.visibilityOf(ele)).submit();

		List<WebElement> link = driver.findElements(By.tagName("cite"));
		System.out.println("Total links on the Wb Page: " + link.size());

		for (WebElement wb : link) {

			// System.out.println(wb);
			System.out.println(wb.getTagName());

		}

		ele = driver.findElement(By.xpath("//span//cite[text()='https://www.amazon.in']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		ele.sendKeys("iphone 15");

		// click on sertch button

		ele = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		String curruntWindow = driver.getWindowHandle();
		System.out.println(curruntWindow);

		ele = driver.findElement(By.linkText("Apple iPhone 15 (128 GB) - Pink"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

		String NextWindow = driver.getWindowHandle();
		System.out.println(NextWindow);

		if (curruntWindow.equals(NextWindow)) {

			System.out.println(" no need to handle the window");
		}

		// Set<String> childwindow = driver.getWindowHandles();

		/*
		 * ele = driver.findElement(By.xpath(
		 * "//form[@id='addToCart']/following::input[@id='add-to-cart-button']"));
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(ele)); ele.click();
		 */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String addToCart = "/html/body/div[4]/div/div[3]/div[8]/div[7]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[39]/div[1]/span/span/span/input";
		String ss= "//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']";
		ele = driver.findElement(By.xpath(ss));
				wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		
	//	document.querySelector("body > div:nth-child(7) > div:nth-child(80) > div:nth-child(5) > div:nth-child(12) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(28) > div:nth-child(1) > div:nth-child(37) > div:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > input:nth-child(2)")
		
	}

	@AfterTest
	void close() {

		driver.close();

	}

}
