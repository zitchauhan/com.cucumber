package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Login;
import pages.Profile;

public class Login_TC {

static WebDriver driver;
	
public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/login");
		
		//Instantiating Login & Profile page using initElements()
		Login loginPg = PageFactory.initElements(driver, Login.class);
		Profile profilePg = PageFactory.initElements(driver, Profile.class);
		 
		//Using the methods created in pages class to perform actions
		loginPg.LogIn_Action("---your username---", "---your password---");
		profilePg.verifyUser("---your username---");
		profilePg.logout_Action();
		 
		driver.quit();		
						}

}