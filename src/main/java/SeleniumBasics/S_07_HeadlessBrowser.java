// Headless: Browser will be opened but not visible/ hidden browser
// We can take screenshot in headless mode
// Testing is happening behind the scene
// Faster than normal mode

// Incognito: Does not maintain any cash or cookies


// Run in headless and incognito mode
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_07_HeadlessBrowser
{

	public static void main(String[] args)
	{
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addArguments("--headless");
		firefoxOptions.addArguments("--incognito");
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();

		// Overloaded constructor of "ChromeDriver" class will be called
		//WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Equivalent to:
			// Go to the web-site, right click -> click on "View/ Get Page Source"
		// Javascript/ HTML written for the web-page
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
