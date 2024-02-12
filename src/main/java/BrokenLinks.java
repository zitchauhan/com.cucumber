import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		String homePage = "http://www.zlti.com";
		String url = "";

		HttpURLConnection huc = null;

		int respCode = 200;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

		}
/*		
		200 – Valid Link/success
		301/302 - Page redirection temporary/permanent
		404 – Page not found
		400 – Bad request
		401 – Unauthorized
		500 – Internal Server Error
	*/	

		
		
		
		
		if (url == null || url.isEmpty())

		{
			System.out.println("URL is either not configured for anchor tag or it is empty");

		}

		if (!url.startsWith(homePage))

		{
			System.out.println("URL belongs to another domain, skipping it.");
			// continue;
		}

		try {
			huc = (HttpURLConnection) (new URL(url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			respCode = huc.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();
	}

	public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            
            httpURLConnect.setConnectTimeout(5000);
            
            httpURLConnect.connect();
            
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }    
       
            //Fetching and Printing the response code obtained
            else
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) 
        
        {
        	
        }
    }
	
}
