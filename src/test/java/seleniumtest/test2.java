package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	
	//take all links in a web page
	
	@Test
	public void testing() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Honda \n");
		
		Thread.sleep(5000);
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		
		for (WebElement links : alllinks) {
			System.out.println(links.getAttribute("href"));
		}
		
	}

}
