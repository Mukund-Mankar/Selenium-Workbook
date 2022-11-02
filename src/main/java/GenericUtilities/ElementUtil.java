package GenericUtilities;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<WebElement> getElements(By byLocator)
	{
		return driver.findElements(byLocator);
	}
	
	public List<String> getElementsText(By byLocator)
	{
		List<WebElement> allElements =  getElements(byLocator);
		List<String> elementTextList = new ArrayList<String>();
		
		for (WebElement eWebElement : allElements)
		{
			elementTextList.add(eWebElement.getText());
		}
		
		return elementTextList;
	}
	
	
	public void doSendKeys(By byLocator, String value)
	{
		getElement(byLocator).sendKeys(value);
	}
	
	public String getElementText(By byLocator)
	{
		return getElement(byLocator).getText();
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value)
	{
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}
	
	public void doClick(String locatorType, String locatorValue)
	{
		getElement(getBy(locatorType, locatorValue)).click();;
	}
	
	public void doClick(By byLocator)
	{
		getElement(byLocator).click();
	}
	
	public boolean isElementDisplayed(By byLocator)
	{
		return getElement(byLocator).isDisplayed();
	}
	
	public boolean isElementDisplayed(String locatorType, String locatorValue)
	{
		return getElement(getBy(locatorType, locatorValue)).isDisplayed();
	}
	
	private By getBy(String locatorType, String locatorValue)
	{
		// Default value of By class is null
		By locator = null;
		
		switch (locatorType.toLowerCase())
		{
		case "id":
			locator = By.id(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		
		default:
			System.out.println("Please pass correct locator");
			break;
		}
		
		return locator;
	}
}
