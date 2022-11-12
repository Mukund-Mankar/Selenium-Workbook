// SVG - Scalar Vector Graphs
// SVG elements have a tag <svg> in DOM
// Special XPath will work with svg elements
// Example
	// Flipkart: Search icon to the right of input search box


package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_49_XPathForSVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		//flipkart search icon: //*[local-name()='svg']/*[name()='g' and @fill-rule='evenodd']
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());
		Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
				if(name.equals("Delaware")) {
					e.click();
					break;
				}
		}
		
	}

}