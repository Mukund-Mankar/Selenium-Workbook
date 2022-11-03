// "Select" HTML tag for dropdown 
// Use "Select" class in Selenium
	// Works only when dropdown HTML tag is "Select"

package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_15_DropdownHandling_SelectTag
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		// Parent locator
		By countryDropdownBy = By.id("Form_getForm_Country");
		
		// All child common locator
		By countryDropdownChildElementsBy = By.tagName("option");
		
		// XPath to reach all child elements from parent element
		By countryDropdownChildElementsFromParentBy = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		elementUtil.doDropdownSelectByIndex(countryDropdownBy, 1);
		elementUtil.doDropdownSelectByValue(countryDropdownBy, "India");
		elementUtil.doDropdownSelectByVisibleText(countryDropdownBy, "Australia");
		
		// Get the count of all WebElements in Select dropdown
		System.out.println(elementUtil.getAllSelectDropdownElementsCount(countryDropdownBy));
		
		// Verify if Japan is present in dropdown
		System.out.println(elementUtil.isElementTextPresentInSelectDropdown(countryDropdownBy, "Japan"));
		
		// Select the dropdown element without select class [Method - 1]
		WebElement countryDropdownElement = elementUtil.getElement(countryDropdownBy);;
		
		// Get all the child elements of parent web element
		List<WebElement> allDropdownElements_01 = countryDropdownElement.findElements(countryDropdownChildElementsBy);
		
		for (WebElement webElement : allDropdownElements_01)
		{
			if(webElement.getText().equals("Spain"))
			{
				webElement.click();
				break;
			}
		}
		
		// Select the dropdown element without select class [Method - 2]
		List<WebElement> allDropdownElements_02 = elementUtil.getElements(countryDropdownChildElementsFromParentBy);
		for (WebElement webElement : allDropdownElements_02)
		{
			if(webElement.getText().equals("Maldives"))
			{
				webElement.click();
				break;
			}
		}
		
		

	}
}
