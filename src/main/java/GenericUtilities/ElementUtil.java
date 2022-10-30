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
}
