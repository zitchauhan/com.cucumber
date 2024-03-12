package SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='userName']")

	private WebElement userNameField;
	
	@FindBy(xpath  = "//imput[@class = 'password']")
	private WebElement userPasswordField;
	

	public LoginPage(WebDriver driver) 
	{ 																			// // Constructor to initialize elements using PageFactory

		this.driver = driver; 																	// Assigning the provided WebDriver instance to the member variable 'driver'

		PageFactory.initElements(driver, this);											 // Initializing the WebElements annotated with @FindBy using PageFactory
	}
	
	

	public void enterUserName(String userName) {

		userNameField.sendKeys(userName);
	}
}
