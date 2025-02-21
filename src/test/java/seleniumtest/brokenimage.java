package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenimage {
@Test
	public void brokenimagetest() throws InterruptedException {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement bimage=driver.findElement(By.xpath("//img[@src='asdf.jpg']"));
		
	}
}
