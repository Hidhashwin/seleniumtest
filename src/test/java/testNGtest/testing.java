package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
	WebDriver driver;

	@BeforeSuite
	public void launchbrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(dataProvider = "datasupplmethod")
	public void HRMlogin(String username, String pword) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();

	}

	@DataProvider(name = "datasupplmethod")
	public Object[][] datasupply() {

		Object[][] data = { { "Admin", "test" }, { "Admin", "admin123" }, { "arun", "admin123" } };
		return data;

	}

}
