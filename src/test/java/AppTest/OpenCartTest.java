package AppTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


public class OpenCartTest extends _BaseTest
{
	
	@Test
	public void urlTest()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String urlString = driver.getCurrentUrl();
		AssertJUnit.assertTrue(urlString.contains("opencart"));
	}
}