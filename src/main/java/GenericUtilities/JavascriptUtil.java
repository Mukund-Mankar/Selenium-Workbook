package GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptUtil
{
	private WebDriver driver;
	
	
	public JavascriptUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/** Get Page Title */
	public String getTitle()
	{
		// Convert the driver to JavascriptExecutor
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		return jsExecutor.executeScript("return document.title;").toString();
	}
	
	// Use case:
		// 1. During code debugging
		// 2. During code Demo
	public void generateAlert(String message)
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("alert('"+ message +"')");
	}
	
	// Get the text present on the entire page.
	// Use Cases
		// Content testing
		// Verify any important text present in the page
	// Different from "driver.getPageSource()" which returns the page javascript code
	public String getpageInnerText()
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		return jsExecutor.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void refreshPage()
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("history.go(0)");
	}
}
