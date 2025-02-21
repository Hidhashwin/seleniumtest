package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesample {
	@Test
	public void frametest() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		//WebElement frame1=driver.findElement(By.id("//a[text()='iFrame']"));
		//frame1.click();
		
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.linkText("Nested Frames"));
		frame1.click();
		
		
	}

}
