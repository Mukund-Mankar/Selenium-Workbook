//The browser only understand javascript

// JSExecutor Use cases - Selenium does not provide these functionalities
	// Scroll up/ down
	// Creation of alerts
	// Getting the text of entire page
	// Click on Webelement

// To perform the javascript functionality, selenium provides JavascriptExecutor Interface


package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_42_JavascriptExecutor
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		GenericUtilities.JavascriptUtil javascriptUtil = new GenericUtilities.JavascriptUtil(driver);
		
		System.out.println(javascriptUtil.getTitle());
		
		//javascriptUtil.generateAlert("This is sample alert");
		
		//System.out.println(javascriptUtil.getpageInnerText());
		
		javascriptUtil.refreshPage();
		
	}
}
