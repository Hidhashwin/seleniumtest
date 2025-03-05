package seleniumtest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trail2 {
	@Test
	public void dropdowntest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		WebElement drop=driver.findElement(By.id("userSelect"));
		drop.click();
		Select select=new Select(drop);
		Thread.sleep(2000);
		select.deselectByIndex(0);
		List<WebElement> totaloptions=select.getOptions();
		int options=totaloptions.size();
		System.out.println("all options" + options);
		
		
	}

}
