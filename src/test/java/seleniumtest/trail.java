package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trail {
	@Test
	public void testing() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//*[@name=\'username\']"));
		username.sendKeys("Admin");
		WebElement pword=driver.findElement(By.xpath("//*[@name=\'password\']"));
		pword.sendKeys("admin123");
		
		WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
		submit.click();
		Thread.sleep(4000);
		WebElement adminbtn=driver.findElement(By.
				xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
		adminbtn.click();
		Thread.sleep(1000);
		
				WebElement input1=driver.findElement(By.
				xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input\r\n"
						+ ""));
		input1.sendKeys("HiGopal");
	}

}
