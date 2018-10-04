package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Registarion {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	public void regTest() {
		
		String expTitle = "abc";
		String actTitle = "abc2";
		
		System.out.println("A");
		
		Assert.assertEquals(actTitle, expTitle);
		//Assert.assertTrue(2>1, "error message");
		//softassert.assertEquals(actTitle, expTitle);
		
		System.out.println("B");
		
		//softassert.assertAll();
	}

}
