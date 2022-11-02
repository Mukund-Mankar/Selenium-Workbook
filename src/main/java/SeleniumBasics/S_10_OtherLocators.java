package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_10_OtherLocators
{
	static WebDriver driver;

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
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
		// Get all link text in a webpage [For any link if there is no text attached, remove that text]
		By allLinkTextBy = By.tagName("a");
		for (WebElement myElement : name(allLinkTextBy))
		{
			System.out.println(myElement.getText());
		}
		
		// By Tag name [2nd example]
		// There will be only one "h1" tag on a webpage [h1 = heading]
		//By webpageMainHeadingBy = By.tagName("h1");
		//System.out.println(elementUtil.getElementText(webpageMainHeadingBy));
	}
	public static List<WebElement> name(By byLoactor)
	{
		return driver.findElements(byLoactor);
	}

}
