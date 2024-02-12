import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/links");

		String str = "";
		List<WebElement> listUrl = driver.findElements(By.tagName("a"));

		Iterator iterator = listUrl.iterator();

		while (iterator.hasNext())

		{
			iterator.next();

		}

		for (int i = 0; i < listUrl.size(); i++) {

			String stt = listUrl.get(i).getText();

			System.out.println(stt);
		}

		for (WebElement wb : listUrl)

		{

			String links = wb.getText();
		}

		//--------------------------------------------------
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		// list.size() ; 
		String url = "";
		for( int i = 0 ; i < list.size() ; i++) 
			{

			WebElement e1 	 = list.get(i);
			 url   = e1.getAttribute("href");

			}

		try {

		URL urls = new URL( url) ; 
		HttpURLConnection  httpURLConnection = (HttpURLConnection ) urls.openConnection();

		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect() ; 

		if ( httpURLConnection.getResponseCode() >=400) 

		{

			System.out.println( url + "" + httpURLConnection.getResponseMessage() + "is broken lon" );
		}
		else if ( httpURLConnection.getResponseCode() >=200){
			
		
			System.out.println(url + "" + httpURLConnection.getResponseMessage());
		}

		} 
		catch (Exception e)
		{
			e.printStackTrace() ;
		} 

		
		
		
		driver.quit();
	}

}