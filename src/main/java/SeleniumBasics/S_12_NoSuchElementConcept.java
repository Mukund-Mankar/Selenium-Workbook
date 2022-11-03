// Verify if the element is present/ displayed on the webpage
	// elementUtil.isElementPresent(elementByLocator)
	// elementUtil.isElementDisplayed(elementByLocator)

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_12_NoSuchElementConcept
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://www.orangehrm.com/");
		
		// "driver.findElements" - If the locator value is incorrect
		// No Error will be thrown, "driver.findElements" returns 0
		// [For multiple elements] Verify if the "navigationLinkHeaders" are present on a webpage
		By navigationLinkHeadersBy = By.className("nav-link-hedd"); // Correct: By.className("nav-link-hedd")
		if(elementUtil.isElementPresent(navigationLinkHeadersBy))
		{
			System.out.println(elementUtil.getElementsCount(navigationLinkHeadersBy) + " navigationLinkHeaders are present in the webpage");
		}
		
		// "driver.findElement" - If the locator value is incorrect
		// Error [org.openqa.selenium.NoSuchElementException]
		//By platformLinkTextBy = By.linkText("Platformm"); //Correct: By.linkText("Platform")
		//String platformLinkText = elementUtil.getElementText(platformLinkTextBy);
		//System.out.println(platformLinkText);
		
		// [For single element] Verify if the "Platform" link is present on a webpage
		By platformLinkBy = By.linkText("Platformm"); // Correct: By.className("nav-link-hedd")
		if(elementUtil.isElementPresent(platformLinkBy))
		{
			System.out.println("platform link is present in the webpage");
		}	
 	}

}
