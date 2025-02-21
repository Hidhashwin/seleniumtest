package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltip {
@Test
	public void tooltipsample() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/tool-tips");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement name=driver.findElement(By.id("toolTipButton"));
	name.getAttribute("title");
	}
}
