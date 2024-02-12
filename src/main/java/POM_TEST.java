import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_TEST {

	WebDriver driver;

	public POM_TEST(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement My_Account;

	@FindBy(linkText = "Login")
	private WebElement login;

	public void clickOnLogin() {

		login.click();
	}

	public void My_Account_click() {
		My_Account.click();

	}

}
