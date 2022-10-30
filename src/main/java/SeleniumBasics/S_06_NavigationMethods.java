package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_06_NavigationMethods
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		// Simulate browser back button
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// Simulate browser forward button
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		// Simulate browser refresh button
		driver.navigate().refresh();
		
		driver.quit();
	}

}
