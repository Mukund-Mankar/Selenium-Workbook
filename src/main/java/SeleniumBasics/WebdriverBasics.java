package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasics
{

	public static void main(String[] args)
	{
		
		//Windows
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		
		//Mac
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
