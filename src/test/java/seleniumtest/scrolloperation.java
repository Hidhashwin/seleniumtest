package seleniumtest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolloperation {
	@Test
	public void hdd() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		  JavascriptExecutor executor=(JavascriptExecutor) driver;
		// executor.executeScript("window.scroll(0,550)",""); Thread.sleep(3000);
		 // executor.executeScript("window.scroll(0,-550)","");
		 
		
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)","");
		
		//use robot class
	}

}
