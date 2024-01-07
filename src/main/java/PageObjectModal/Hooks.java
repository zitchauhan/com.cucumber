package PageObjectModal;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	private static WebDriver driver;

	@Before
	public void setUp() {
		
		String browser = System.getProperty("browser", "chrome"); // Default to Chrome if no browser is specified
        driver = WebDriverFactory.createWebDriver(browser);
		
		//WebDriverManager.chromedriver().setup();
	}
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}

}
