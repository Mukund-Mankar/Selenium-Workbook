// "iFrame" and "Frame" tags: Both are same
// Frame is a webelement
// Every frame has it's own HTML document
// Driver should switch to the frame to access frame elements
// Every frame usually has a name or an id to uniquely identify them
	// In some scenarios, 2 frames can have the same name. Prefer using "driver.switchTo().frame("XPath");"

// Example Website: http://www.londonfreelance.org/courses/frames/index.html
// There are multiple frames in the webpage.
// All the elements available in this page are inside these frame

// For nested frames:
	// Go to any frame by: "driver.switchTo().frame("Argument of that frame");"
	// To go to it's immediate parent frame: "driver.switchTo().parentFrame();" [Selenium 4]

// For more than 1 frame in a webpage:
	// Go to any frame by: "driver.switchTo().frame("Argument of that frame");"
	// Go to another frame:
		// Go to HTML DOM again: driver.switchTo().defaultContent();
		// From HTML DOM, go to next frame of your choice

// Confirm a certain element in a webpage is a frame
	// Right Click -> Observe that "View Frame Source" is present

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_18_FrameHandling
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		// Entire application is inside the frame only
		driver.get("https://classic.freecrm.com/index.html"); 
		
		// Login
		driver.findElement(By.name("username")).sendKeys("VipulGandhi"); 
		driver.findElement(By.name("password")).sendKeys("Classicfreecrm@123");
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		
		Thread.sleep(5000);
		
		// Frame method is overloaded
		// Switch to frame DOM inside Webpage
		driver.switchTo().frame("mainpanel");
		
		// Frame element
		driver.findElement(By.linkText("CONTACTS")).click();
		
		// Switch back to HTML DOM to access it's webelement
		driver.switchTo().defaultContent();
		
		
	}
}
