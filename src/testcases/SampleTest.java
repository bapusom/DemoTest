package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class SampleTest {
	
	@Test(priority=-1)
	public void LoginTest() {
		
		Assert.assertEquals("A", "B");
		System.out.println("LoginTest");
	}

	@Test(priority=0, dependsOnMethods= {"LoginTest"})
	public void testChangePssword() {
		
		System.out.println("change password");
	}
	
	@Test(priority=1)
	public void logoutTest() {
		
		throw new SkipException("skipped testcase");
	}
}
