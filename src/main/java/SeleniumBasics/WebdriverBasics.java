// Webdriver API
	// Interface: SearchContext  [Methods declared: FindElement(), FindElements()]
	// Interface: WebDriver extends SearchContext [Methods declared: get(), click(), sendKeys(), close()] etc.
	// Class: "RemoteWebDriver implements WebDriver
		// All the methods of WebDriver interface is implemented in RemoteWebDriver
		// RemoteWebDriver class can execute WebDriver commands on a browser running on a different (remote) machine
		// RemoteWebDriver driver = new ChromeDriver(); can also be used against WebDriver driver = new ChromeDriver(); [Will work 100%]"
	// ChromiumDriver(class) extend RemoteWebDriver, ChromeDriver(class) extend ChromiumDriver
	// FirefoxDriver(class) extends RemoteWebDriver

// [Error] org.openqa.selenium.SessionNotCreatedException
	// Reason
		// Chromedriver and chrome browser version are mismatched

// All the messages printed in console is not error messages but Info.



package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasics
{

	public static void main(String[] args)
	{
		
		//Windows
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		
		//Mac
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		// Top Casting
			// Advantage: Use same reference variable to launch different browsers
		// Child class object is referred by parent interface reference variable
		// As the object of "ChromeDriver()" class is created, it's constructor also gets called.
			// The logic to launch the browser is written in the class constructor
		WebDriver driver = new ChromeDriver(); // Launch chrome browser
		
		
		//[Error] org.openqa.selenium.InvalidArgumentException
		// It is compulsory to pass "http" or "https"
		//driver.get("www.google.com/");
		
		// [Remove www] Works properly
		//driver.get("https://google.com/");
		
		driver.get("https://www.google.com/");
		
		// Validation point
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("Google"))
		{
			System.out.println("Pass -- Correct Title");
		}
		else
		{
			System.out.println("Fail -- Incorrect Title");
		}
		
		// Validation point
		String currentURL = driver.getCurrentUrl();
		if(currentURL.equals("https://www.google.com/"))
		{
			System.out.println("Pass -- Correct URL");
		}
		else
		{
			System.out.println("Fail -- Incorrect URL");
		}
		
		// Quit browser
		driver.quit();
	}

}
