package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args)
	{
		//*[@id="ember9"]/div/div/label
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.linkedin.com/home");
		
		WebElement testElement = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div[2]/div/ul/li[4]/a"));
		
		System.out.println(testElement.getText());
	}

}
