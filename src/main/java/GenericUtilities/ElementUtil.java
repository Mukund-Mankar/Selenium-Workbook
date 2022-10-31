package GenericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil
{
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getElement(By byLocator)
	{
		return driver.findElement(byLocator);
	}
	
	public void doSendKeys(By byLocator, String value)
	{
		driver.findElement(byLocator).sendKeys(value);;
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value)
	{
		driver.findElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}
	
	private By getBy(String locatorType, String locatorValue)
	{
		
		By locator = null;
		
		switch (locatorType.toLowerCase())
		{
		case "id":
			locator = By.id(locatorValue);
			break;
		
		default:
			System.out.println("Please pass correct locator");
			break;
		}
		
		return locator;
	}
}
