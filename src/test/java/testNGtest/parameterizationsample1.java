package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterizationsample1 {
public WebDriver driver;
	
	
	@Parameters("URL1")
	@Test
	public void launchyahoo(String url1) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url1);
	}
	@Parameters("URL2")
	@Test
	public void launchbing(String url2) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url2);
	}
}
