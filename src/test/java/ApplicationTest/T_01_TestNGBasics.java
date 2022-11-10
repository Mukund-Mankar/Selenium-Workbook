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
