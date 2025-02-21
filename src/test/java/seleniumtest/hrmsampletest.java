package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hrmsampletest {
	
	@Test
	public void hrm(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		username.sendKeys("admin123");
		
		WebElement sumitbutton=driver.findElement(By.xpath("//*[@type=\'submit\']"));
		sumitbutton.click();
	}

}
