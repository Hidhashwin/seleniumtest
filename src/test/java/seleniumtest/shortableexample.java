package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shortableexample {
@Test	
public void shotsample() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/sortable");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement> listofelements=driver.findElements(By.xpath("//div[@id='demo-tabpane-list']"));
	
	WebElement fromelement=listofelements.get(5);
	WebElement toelement=listofelements.get(2);
	
	Actions actions=new Actions(driver);
	actions.clickAndHold(fromelement);
	actions.moveToElement(toelement);
	actions.release(toelement);
	actions.build().perform();
}
}
