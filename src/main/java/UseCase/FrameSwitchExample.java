package UseCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitchExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to a webpage containing a frame
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

        // Switch to the frame
        driver.switchTo().frame("iframeResult");

        // Interact with an element inside the frame
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
        radioButton.click();

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
