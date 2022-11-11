// TestNG classes do not require main() method
// Add TestNG maven dependency to pom.xml
	// To get all TestNG jar files

/*
<dependency>
	<groupId>org.testng</groupId>
	<artifactId>testng</artifactId>
	<version>7.6.1</version>
	<scope>test</scope>
</dependency>
 */

// <scope>test</scope>
	// It signifies it's scope will be limited to src/test/java
	// Prefer removing the scope

// Install plugin 
	// Required to run TestNG classes - As they have no main() method
	// Go to Eclipse -> Help -> Eclipse Marketplace
		// Search for TestNG -> Install

// TestNG is a Java Unit testing framework

//TestNG could be used with Selenium, RestAssured, Appium

// Create testng.xml file
	// Right click project -> TestNG -> Convert to TestNG
		// testng.xml file will be created
		// Create a resource folder if not already present
			// Right click project -> New -> Source Folder
				// Name it: src/test/resources
				// This source folder will contain all the external files used in the project
					// Example: xml files, json files, properties, excel sheets etc
		// Under the resource folder, create a folder, name it - testrunners
			// Move testng.xml to this folder
	// To create more testng.xml files
		// Right click project -> New -> file
			// name the file (with extension .xml)
			// Copy below code to the newly created file - this code defined the file to be an xml
				/*
	
			 	<?xml version="1.0" encoding="UTF-8"?>
				<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
				
				 */

// TestNG Reports
	// After running testNG.xml file, refresh the project
	// A new folder "test-output" will be created
	// index.html and emailable-report.html file inside this folder contains the test report in HTML format

// To run a single @Test from a class
	// Click on the test name  -> Run As -> TestNG Test

