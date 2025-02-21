package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionexample {
	
	@Test
	public void assertionsample() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//h5[text()='Login']"));
		String word=text.getText();
		//Assert.assertEquals("Login", word);
		//Assert.assertTrue(true, word);
		//Assert.assertfalse(false, word);
		//Assert.assertNotEquals("new login", word);
	}

}
