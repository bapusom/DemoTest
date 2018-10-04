package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptExecutor {

	public static WebDriver d;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_softwares_latest\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("alert('hello world');");
	}

}
