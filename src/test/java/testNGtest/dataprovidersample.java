package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovidersample{
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchbrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(dataProvider = "datasupplier")
	public void orangHRM(String usernm,String pword) throws InterruptedException {
		launchbrowser();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys(usernm);
		WebElement password=driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys(pword);
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	@DataProvider(name="datasupplier")
	public Object[][] datapassmethod() {
		
		Object[][] data= {{"Admin","test"},{"Admin","admin123"},{"arun","admin123"}};
		return data;
	}
	
}
