// Locators
	// ID
	// name
	// tag name
	// Class name
	// CSS
	// XPath
	// Link text
	// Partial link text

// On a webpage: Right click -> Click on "Inspect"
	// "Chrome Dev Tools" opens up which contains "Element", "Console", "Sources", "Network", "Performance" tabs etc.
		// "Element" tab displays DOM(Document Object Model) 
			// DOM is a XML document

// Sample
	// <input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
		// Tag: input
		// Attribute: type
		// Value: text


package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S_08_LocatorConcept
{
	
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil =  new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		// 1st approach
			// Cons
				// Difficult to locate the element everywhere if it's  id changes
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		// 2nd approach
			// Cons
				// WebElement is created every time, even if it is not needed
				// Every time any method of "driver" is called (eg. "driver.findElement"), a request is sent to the server
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));		
		//emailId.sendKeys("test@gmail.com");
		//password.sendKeys("test@123");
		
		// 3rd approach
			// Pros
				// By.id does not create a WebElement, no request to server is made
			// Cons
				// Not generic
		//By emailBy = By.id("input-email");
		//By passwordBy = By.id("input-password");
		
		//driver.findElement(emailBy).sendKeys("email@gmail.com");
		//driver.findElement(passwordBy).sendKeys("password@123");
		
		// 4th approach
		// Pros
			// Generic, Have to write "driver.findElement" only once
		//By emailBy = By.id("input-email");
		//By passwordBy = By.id("input-password");
		
		//getElement(emailBy).sendKeys("test@gmail.com");
		//getElement(passwordBy).sendKeys("password@123");
		
		// 5th approach
		//By emailBy = By.id("input-email");
		//By passwordBy = By.id("input-password");
		
		//doSendKeys(emailBy, "test@gmail.com");
		//doSendKeys(passwordBy, "password@123");
		
		// 6th approach: Element util class with generic methods
		By emailBy = By.id("input-email");
		By passwordBy = By.id("input-password");
		elementUtil.doSendKeys(emailBy, "test@gmail.com");
		elementUtil.doSendKeys(passwordBy, "password@123");
		
		
	}
	
	// Generic wrapper method
	public static WebElement getElement(By byLocator)
	{
		return driver.findElement(byLocator);
	}
	
	// Generic wrapper method
	public static void doSendKeys(By byLocator, String value)
	{
		driver.findElement(byLocator).sendKeys(value);;
	}
	
}
