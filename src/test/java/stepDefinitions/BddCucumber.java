package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BddCucumber {

	WebDriver driver;
	WebElement webElement;

	@Before

	public void setup() {

		// System.setProperty("webdriver.chrome.driver",
		// "src/test/resources/Drives/chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Given("User is on Home Page")
	public void User_is_on_Home_Page()

	{
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User Navigate to LogIn Page")
	public void User_Navigate_to_LogIn_Page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM");
	}

	/*
	 * @And("User enters LogIn Credentials") public void
	 * User_enters_LogIn_Credentials(String userName, String passWord) { webElement
	 * = driver.findElement(By.xpath("//input[@name='username']"));
	 * webElement.sendKeys(userName); webElement =
	 * driver.findElement(By.xpath("//input[@name='password']"));
	 * webElement.sendKeys(passWord); }
	 */

	/*
	 * @When("1Userit enters LogIn Credentials") public void
	 * AUseri_enters_LogIn_Credentials(DataTable table) { List<Map<String, String>>
	 * listofMap = table.asMaps(String.class, String.class);
	 * 
	 * Map<String, String> userName = listofMap.get(0); Map<String, String> passWord
	 * = listofMap.get(1);
	 * 
	 * System.out.println(userName);
	 * 
	 * webElement = driver.findElement(By.xpath("//input[@name='username']"));
	 * String userName1 = userName.get(userName); webElement.sendKeys(userName1);
	 * 
	 * webElement = driver.findElement(By.xpath("//input[@name='username']"));
	 * String passWord1 = userName.get(passWord); webElement.sendKeys(passWord1); }
	 */
	@When("User enters LogIn Credentials")
	public void User_enters_LogIn_Credentials(DataTable table) {
		List<Map<String, String>> listofMap = table.asMaps(String.class, String.class);

		// Assuming the table has only one row of credentials
		String username = listofMap.get(0).get("Username");
		String password = listofMap.get(0).get("Password");

		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);

	}

	@When("OtherUser enters LogIn Credentials")
	public void OtherUser_enters_LogIn_Credentials(DataTable table) {
		List<Map<String, String>> listofMap = table.asMaps(String.class, String.class);

		// Assuming the table has only one row of credentials
		for (Map<String, String> map : listofMap)

		{
			String uName = map.get("UserName");
			String password = map.get("Password");
			System.out.println("Adding " + uName + " " + password + " to the cart");
			WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
			usernameField.sendKeys(uName);
			WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
			passwordField.sendKeys(password);

		}

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		try {

			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		} catch

		(Exception e) {

		}
		;

		System.out.println("Succefull login");
	}

	@After

	public void teardown() {

		driver.close();

	}

}
