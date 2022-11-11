package AppTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends _BaseTest
{
	
	@Test
	public void searchFieldTest()
	{
		driver.get("https://www.google.co.in/");
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		
		// Assert class is overloaded
		AssertJUnit.assertTrue(flag);
	}
}

