// Static web table
// Task: Print all company names

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_23_StaticWebtable
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		By companyNamesBy = By.xpath("//table[@class='ws-table-all']//tr/td[1]");
		elementUtil.printAllStringElements(elementUtil.getElementsText(companyNamesBy));
	}

}
