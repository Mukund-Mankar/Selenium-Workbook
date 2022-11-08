// Drag drop one webelement to other webelement

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_29_ActionsClassDragDrop
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By draggabelElementBy = By.id("draggable");
		By droppableElementBy = By.id("droppable");
		
		Actions actions = new Actions(driver);
		
		// Method - 01
		// Observe Builder pattern
			// Every method is returning same current class object
//		actions
//			.clickAndHold(elementUtil.getElement(draggabelElementBy))
//			.moveToElement(elementUtil.getElement(droppableElementBy))
//			.release()
//			.build()
//			.perform();
		
		// Method - 02
		actions
			.dragAndDrop(elementUtil.getElement(draggabelElementBy), elementUtil.getElement(droppableElementBy))
			.build()
			.perform();
		
		
	}
}
