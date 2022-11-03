// "Select" HTML tag for dropdown 
// Use "Select" class in Selenium
	// Works only when dropdown HTML tag is "Select"

package SeleniumBasics;

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
		
		By countryDropdownBy = By.id("Form_getForm_Country");
		elementUtil.doDropdownSelectByIndex(countryDropdownBy, 1);
		elementUtil.doDropdownSelectByValue(countryDropdownBy, "India");
		elementUtil.doDropdownSelectByVisibleText(countryDropdownBy, "Australia");
	}
}
