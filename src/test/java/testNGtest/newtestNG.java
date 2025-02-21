package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtestNG {
	
	public WebDriver driver;
	
	
	
	@Test
	public void launchyahoo() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.yahoo.co.in/");
	}
	@Test
	public void launchbing() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
	}
}
