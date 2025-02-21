package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleclick {
	@Test
	public void doubleclickoperation() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://demoqa.com/buttons");
	WebElement doub=driver.findElement(By.id("doubleClickBtn"));
	Actions actions=new Actions(driver);
	actions.doubleClick(doub).perform();
	Thread.sleep(3000);
	
	WebElement message=driver.findElement(By.xpath("//p[text()='You have done a double click']"));
	String messagetext=message.getText();
	Assert.assertEquals(messagetext, "You have done a double click");
	
	}
}
