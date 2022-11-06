// Structure:
	// <table> -> <tbody> -> multiple <tr> (table rows) -> Every <tr> has multiple <td> (table columns) -> <td> can have multiple child elements

//Get parent element
// WebElement parent = child.findElement(By.xpath(".."));

package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_20_DynamicWebtable_Sample01
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebElement firstAGroupElement = null;
		WebElement aGroupElementRowElement = null;
		
		driver.manage().window().maximize();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		// Find the first company in group A whose %change is highest
		By allGroupsElementsBy = By.xpath("//table[@class='dataTable']//tr/td[2]");
		List<WebElement> allGroupsElements = elementUtil.getElements(allGroupsElementsBy);
		
		for (WebElement webElement : allGroupsElements)
		{
			if(webElement.getText().equals("A"))
			{
				firstAGroupElement = webElement;
				break;
			}
		}
		
		// Get the company name (From child element, go to parent element --> from parent element to to specific child element)
		aGroupElementRowElement = firstAGroupElement.findElement(By.xpath("../td/a"));
		System.out.println(aGroupElementRowElement.getText());				
	}
}
