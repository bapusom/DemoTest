package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sampleTest() throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_softwares_latest\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.toolsqa.com");
 
		Thread.sleep(5000);
		driver.quit();
	}

}
