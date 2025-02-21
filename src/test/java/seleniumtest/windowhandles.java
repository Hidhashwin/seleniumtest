package seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {
	@Test
	public void windowtest() throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Thread.sleep(2000);
		Set<String> allwindow=driver.getWindowHandles();
		
		for (String newwindow : allwindow) {
			driver.switchTo().window(newwindow);
		}
		driver.close();
		driver.switchTo().window(parentwindow);
		WebElement page= driver.findElement(By.linkText("Elemental Selenium"));
		page.click();
	}

}
