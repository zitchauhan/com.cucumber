import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourTestScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// .manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");

		POM_TEST pomTest = new POM_TEST(driver);

		// Example usage
		pomTest.My_Account_click();

		// Continue with other test actions
	}
}
