// Window handle operations are easier to handle with list than set

package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_54_BrowserWindowHandleWithList
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);

		Thread.sleep(5000);
		
		By twitterLinkBy = By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']");
		
		elementUtil.doClick(twitterLinkBy);
		
		Set<String> allWindowHandleIdsSet =  driver.getWindowHandles();
		
		// Create a list object
		List<String> allWindowHandleIdsList = new ArrayList<String>();
		
		// Get all set objects in the list
		allWindowHandleIdsList.addAll(allWindowHandleIdsSet);
		
		String parentWindowHandleString = allWindowHandleIdsList.get(0);
		String childWindowHandleString = allWindowHandleIdsList.get(1);
		
		driver.switchTo().window(childWindowHandleString);
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindowHandleString);
		System.out.println(driver.getCurrentUrl());
	}
}
