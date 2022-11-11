// Create a base class
	// Add all the methods in it which are common to all the Test classes
// Let this base class be the parent of all the Test classes - Inheritance concept

package AppTest;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _BaseTest
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
	
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
