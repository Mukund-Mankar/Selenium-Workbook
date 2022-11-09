// Browser understands only javascript
// Web Pop-ups/ Modal pop-ups/ Modal dialogues/ Javascript pop-ups
// We can't have multiple alerts at same time
// Javascript alerts are not part of webpage - They are not inside HTML DOM. Web developer writes them


package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S_14_JavascriptAlertPopUp
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GenericUtilities.ElementUtil elementUtil = new GenericUtilities.ElementUtil(driver);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By signInButtonBy = By.className("signinbtn");
		elementUtil.doClick(signInButtonBy);
		// An alert pops up
		
		// Move driver focus from webpage to alert pop-up
		// Alert is a javascript method
		Alert currentAlert = driver.switchTo().alert();
		System.out.println(currentAlert.getText());
		currentAlert.accept();
	}
}
