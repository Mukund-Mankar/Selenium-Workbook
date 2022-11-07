// Context Click == Right Click
// User actions
	// Right click
	// Double click
	// Drag drop
	// Move to specific element


// Task: Get all the options after right clicking the element
package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_28_ActionsClassContextClick
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		// Pass the driver element in class constructor
		Actions actions = new Actions(driver);
		
		By rightClickuttonBy = By.xpath("//span[text()='right click me']");
		
		// While using Actions class, always use build() and perform() methods.
		// If there is a chain of actions, first build the actions then perform the actions
		// If there is a single action, we can use only perform() as well
		//actions.contextClick(elementUtil.getElement(rightClickuttonBy)).perform();
		actions.contextClick(elementUtil.getElement(rightClickuttonBy)).build().perform();
		
		By rightClickOptionsBy = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
		elementUtil.printAllStringElements(elementUtil.getElementsText(rightClickOptionsBy));
	}
}
