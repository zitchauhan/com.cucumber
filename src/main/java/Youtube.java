import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=rBNk0bGtJ1U");
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> ele = driver.findElements(By.xpath("//yt-live-chat-text-message-renderer[@class=\"style-scope yt-live-chat-item-list-renderer\"]"));
	
			for ( WebElement all : ele)
			{
				
				String s =all.getText();
				System.out.println(s);
			}
			
			ArrayList<String> ls;
	
	Object obj = new Object();
	
	
	
	obj.hashCode();
	obj.equals(obj);
	obj.toString();
	
	}

	private void local() {
	
		// TODO Auto-generated method stub
		final int a = 0;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
