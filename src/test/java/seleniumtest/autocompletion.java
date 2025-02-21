package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocompletion {
	
	@Test
	public void auto() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", checkbox);
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]"));
		checkbox1.sendKeys("s");
	}

}
