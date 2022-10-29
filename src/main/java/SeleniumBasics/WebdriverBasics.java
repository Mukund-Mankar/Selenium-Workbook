package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics
{

	public static void main(String[] args)
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
