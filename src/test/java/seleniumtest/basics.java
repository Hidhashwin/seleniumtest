package seleniumtest;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basics {


	@Test
	public void uitest() throws IOException, InterruptedException {
		System.out.println("Hello");

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\WELCOME\\Desktop\\screenshots\\chromebrowser.jpg"));

		driver.quit();

	}
	@Test(priority = 1)
	public void edge() throws InterruptedException, IOException {
		System.out.println("Hello");

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\WELCOME\\Desktop\\screenshots\\edgebrowser.jpg"));

	}}
