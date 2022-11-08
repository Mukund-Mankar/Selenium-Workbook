package GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils
{
	
	private WebDriver driver;
	
	ElementUtil elementUtil;
	
	public WaitUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// Wait for the element to be present inside the DOM
	// The element could be invisible inside the DOM as well
	public WebElement isPresenceOfElementLocated(By byLocator, int waitForTimeinSeconds)
	{
		// Create object of WebdriverWait
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(waitForTimeinSeconds));
		
		// Wait for the specific time to get the element, once the element is located, assign it to webElement
		// No need to write driver.findElement(byLocator);
		// If element not present
			// [Exception] org.openqa.selenium.TimeoutException
			// [Exception] org.openqa.selenium.NoSuchElementException
		WebElement webElement = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
		
		return webElement;
	}
	
	// Wait for the element to be present inside the DOM
	// The element could be invisible inside the DOM as well
	public WebElement isPresenceOfElementLocated(By byLocator, int waitForTimeinSeconds, long pollingTime)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(waitForTimeinSeconds), Duration.ofMillis(pollingTime));		
		WebElement webElement = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
		return webElement;
	}
	
	// Wait for the element to be present inside the DOM
	// The element should be visible in the page as well
	public WebElement isVisibilityOfElementLocated(By byLocator, int waitForTimeinSeconds)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(waitForTimeinSeconds));
		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		return webElement;
	}
	
	// Wait for the element to be present inside the DOM
	// The element should be visible in the page as well
	public WebElement isVisibilityOfElementLocated(By byLocator, int waitForTimeinSeconds, long pollingTime)
	{
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(waitForTimeinSeconds), Duration.ofMillis(pollingTime));		
		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		return webElement;
	}
}
