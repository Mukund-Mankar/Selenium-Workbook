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
			if(!eWebElement.getText().isBlank())
			{
				elementTextList.add(eWebElement.getText());
			}
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
	
	public String getElementAttributeValue(By byLocator, String attributeName)
	{
		return getElement(byLocator).getAttribute(attributeName);
	}
	
	public List<String> getElementsAttributeValue(By byLocator, String attributeName)
	{
		List<WebElement> allElements =  getElements(byLocator);
		List<String> elementAttributeTextList = new ArrayList<String>();
		
		for (WebElement eWebElement : allElements)
		{
			if(!eWebElement.getAttribute(attributeName).isBlank())
			{
				elementAttributeTextList.add(eWebElement.getAttribute(attributeName));
			}	
		}
		
		return elementAttributeTextList;
	}
	
	public int getElementsCount(By byLocator)
	{
		return getElements(byLocator).size();
	}
	
	public void printAllStringElements(List<String> allStringElements)
	{
		for (String stringElement : allStringElements)
		{
			System.out.println(stringElement);
		}
	}
	
	public boolean isElementPresent(By byLocator)
	{
		return (getElementsCount(byLocator) == 0 ? false : true);
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
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		
		default:
			System.out.println("Please pass correct locator");
			break;
		}
		
		return locator;
	}
}
