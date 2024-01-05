import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BufferReaderf {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.)

	}
}
