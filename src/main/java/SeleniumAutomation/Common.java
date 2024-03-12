package SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common

{
	public static By toByVal(WebElement element) {
		// By format = "[foundFrom] -> locator: term"
		// see RemoteWebElement toString() implementation
		String[] data = element.toString().split(" -> ")[1].replace("]", "").split(": ");
		String locator = data[0];
		String term = data[1];

		switch (locator) {
		case "xpath":
			return By.xpath(term);
		case "css selector":
			return By.cssSelector(term);
		case "id":
			return By.id(term);
		case "tag name":
			return By.tagName(term);
		case "name":
			return By.name(term);
		case "link text":
			return By.linkText(term);
		case "class name":
			return By.className(term);
		}
		return (By) element;
	}

	public static void waitUntilElePresent(WebDriver driver, WebElement Element, Duration DurationOfSeconds)
			throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, DurationOfSeconds);
		By element = toByVal(Element);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}

}
