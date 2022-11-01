package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_10_OtherLocators
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://classic.crmpro.com/index.html");
		
		
		// By name
		//By usernameBy = By.name("username");
		//By passwordBy = By.name("password");
		//elementUtil.doSendKeys(usernameBy, "Username");
		//elementUtil.doSendKeys(passwordBy, "password");
		
		// By Classname
		//By usernameBy = By.className("username");
		//By passwordBy = By.className("password");
		//elementUtil.doSendKeys(usernameBy, "Username");
		//elementUtil.doSendKeys(passwordBy, "password");
		
		// By XPath
			// Select the element from "Chrome Dev Tools" -> "Elements"
			// Right click -> Copy -> Copy XPath
		//By usernameBy = By.xpath("//*[@id=\"loginForm\"]/div/input[1]");
		//By passwordBy = By.xpath("//*[@id=\"loginForm\"]/div/input[2]");
		//elementUtil.doSendKeys(usernameBy, "Username");
		//elementUtil.doSendKeys(passwordBy, "password");
		
		// By CSS Selector
		// Select the element from "Chrome Dev Tools" -> "Elements"
		// Right click -> Copy -> Copy Selector
		//By usernameBy = By.cssSelector("#loginForm > div > input:nth-child(1)");
		//By passwordBy = By.cssSelector("#loginForm > div > input:nth-child(2)");
		//elementUtil.doSendKeys(usernameBy, "Username");
		//elementUtil.doSendKeys(passwordBy, "password");
		
		// By linktext [Only for links]
		//String ContactUsLinkText = "Contact";
		//elementUtil.doClick("linktext", ContactUsLinkText);
		
		// By partialLinkText
			// Use where link text is long
		
		// By Tag name [1st example]
		// Get all the links in a webpage
		//int count = 0;
		//By allLinkTextBy = By.tagName("a");
		//for (int i = 0; i < elementUtil.getElements(allLinkTextBy).size(); i++)
		//{
		//	count += 1;
		//}
		//System.out.println(count);
		
		// By Tag name [2nd example]
		// There will be only one "h1" tag on a webpage [h1 = heading]
		//By webpageMainHeadingBy = By.tagName("h1");
		//System.out.println(elementUtil.getElementText(webpageMainHeadingBy));
		
		
	}
	

}
