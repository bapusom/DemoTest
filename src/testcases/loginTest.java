package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest {
	
	@Test(dataProvider="getData")
	public void logTest(String UserNme,String Password, String Browser) {
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][3];
		
		//1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Chrome";
		
		//2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "Firefox";
		
		return data;
	}
}
