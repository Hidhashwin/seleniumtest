package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectableexample {
@Test	
public void shotsample() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/selectable");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement title=driver.findElement(By.xpath("//a[@id='demo-tab-list']"));
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)", title);
	
	List<WebElement> total=driver.findElements(By.xpath("//ul[@id='verticalListContainer']/li"));
	int totaloptions=total.size();
	System.out.println("totaloptions " +totaloptions);
	
	Actions actions=new Actions(driver);
	actions.clickAndHold(total.get(0));
	actions.clickAndHold(total.get(1));
	actions.clickAndHold(total.get(2));
	actions.build().perform();
}
}
