
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModal_loginPage {

	private WebDriver driver;

	PageObjectModal_loginPage(WebDriver driver) // constructor called ; to initialization the variables
	{

		this.setDriver(driver);
		PageFactory.initElements(driver, this);

	}

	// static String str = "driver.findElement(By.xpath(\"xapth\"))";
	// driver.findElement(By.xpath("xapth")).sendKeys("");
	// driver.findElement(By.xpath(str)).sendKeys(userName);

	@FindBy(xpath = "//tag[@id='user']")
	private WebElement variable;

	public void userName(String userName) {

		variable.sendKeys(userName);

	}

	/// getter and setter method in java for instance variable;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
