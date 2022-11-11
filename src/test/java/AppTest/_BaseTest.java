// Create a base class
	// Add all the methods in it which are common to all the Test classes
// Let this base class be the parent of all the Test classes - Inheritance concept

package AppTest;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _BaseTest
{
	WebDriver driver;
	
	// Parameterization
	// Getting the parameters from testng.xml file
	@Parameters({"url", "browser"})
	@BeforeTest
	public void setup(String url, String browser)
	{
		if(browser.trim().equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if (browser.trim().equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.trim().equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else
		{
			System.out.println("Please pass correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		driver.get(url);
	}
	
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
