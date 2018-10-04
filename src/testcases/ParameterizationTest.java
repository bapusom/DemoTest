package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {
	
	public static WebDriver d;
	@Parameters("browser")
	
	@BeforeClass
	public void startTest(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_softwares_latest\\chromedriver_win32\\chromedriver.exe");
			d = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\selenium_softwares_latest\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium_softwares_latest\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			d = new FirefoxDriver();
		}
	}
	@Test
	public void demoTest() {
		
		d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.manage().window().maximize();
	}
	@AfterClass
	public void exitTest() {
		
		d.close();
	}
}

