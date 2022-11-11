// For more than one @Test, the execution order will be alphabetical - sequence doesn't matter

package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T_02_Annotations
{
	// Global preconditions
		// Before running complete regression suite
	@BeforeSuite
	public void databaseConnection()
	{
		System.out.println("[Before Suite] Database connected ...");
	}
	
	@BeforeTest
	public void createUser()
	{
		// With any api's available or with any sql query, create a user
		System.out.println("[Before Test] User created ...");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("[Before Class] Browser launched ...");
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		System.out.println("[Before Method] Logged in ...");
	}
	
	// Method name should always end with "Test" with every @Test annotation
	@Test
	public void userInfoTest()
	{
		System.out.println("[Test] User info test ...");
	}
	
	@Test
	public void accountInfoTest()
	{
		System.out.println("[Test] Account info test ...");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("[Afer Method] Logout ...");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("[After Class] Close the browser ...");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("[After Test] User Deleted ...");
	}
	
	@AfterSuite
	public void disconnectDatabase()
	{
		System.out.println("[After Suite] Database disconnected ...");
	}
}
