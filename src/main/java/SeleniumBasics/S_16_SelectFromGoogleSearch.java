// Start typing something in google search, a suggestion list comes up without page refresh - Ajax calls
// The suggestions appearing are called Ajax components
// The suggestions are coming from the server via the Ajax calls. Browser(DOM) does not maintain the suggestions


// Task - Get all the text present in suggestion list
package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_16_SelectFromGoogleSearch
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://www.google.com/");
		
		By searchBoxBy = By.name("q");
		elementUtil.doSendKeys(searchBoxBy, "Persia");
		
		Thread.sleep(5000);
		
		By allSuggestionsBy = By.xpath("//*[@class='mkHrUc']//*[@class='wM6W7d']");
		for (String webElement : elementUtil.getElementsText(allSuggestionsBy))
		{
			System.out.println(webElement);	
		}
	}

}
