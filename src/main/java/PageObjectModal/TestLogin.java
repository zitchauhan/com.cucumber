package PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.function.Function;

class LoginPage {
	
	private WaitUtility waitUtility;
	public LoginPage(WebDriver driver) {
		
		//this.driver = driver; 
		PageFactory.initElements(driver, this);
		this.waitUtility = new WaitUtility(driver);
	}
	

	@FindBy(name = "username")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public void enterUsername(String username) {
		//waitUtility.waitForElementPresence();
		usernameField.sendKeys(username);
		
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
}

public class TestLogin extends BaseClass {
	public static void main(String[] args) {
		TestLogin test = new TestLogin();
		WaitUtility wait = new WaitUtility(driver);
		test.initializeDriver(); // Initialize WebDriver
		LoginPage loginPage = new LoginPage(driver);
		
		//wait.waitForElementPresence(usernameField);
	
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLoginButton();
		// Add assertions or further test steps after successful login
		test.tearDown(); // Quit the WebDriver
	}
}

class BaseClass {
	protected static WebDriver driver;

	public void initializeDriver() {

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

class WaitUtility {
	private WebDriver driver;
	private WebDriverWait webDriverWait;
	private FluentWait<WebDriver> fluentWait;

	public WaitUtility(WebDriver driver) {

		this.driver = driver;
		this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

		this.fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1));
	}

	public WebElement waitForElementToBeClickable(WebElement element) {
		return webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement waitForVisibilityOfElement(WebElement element) {
		return webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}


	public WebElement waitForElementWithFluentWait(By locator) {
		return fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
	}

	// Add more methods as needed for different types of waits or conditions
}

/*
 * int instace;
 * 
 * private int getInstance() { return instace; }
 * 
 * private void setIntance(int local) { this.instace = local; }
 */