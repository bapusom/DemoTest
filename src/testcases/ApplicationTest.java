package testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("open browser");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("close browser");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@Test(priority=1)
	public void loginTest() {
		
		System.out.println("Login testcase execution");
		
	}
	
	@Test(priority=2)
	public void changePassword() {
		
		System.out.println("Password changed successfully");
		throw new SkipException("Any Reason");
		
	}
	
	@Test(priority=3, dependsOnMethods= {"changePassword"})
	public void logoutTest() {
		
		System.out.println("Logout successfully");
		
	}

}
