package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleframe {

	public void frametesting() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();

		// Wait for the iframe to be present and switch to it
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
		driver.switchTo().frame(iframe);

		// Now that you're inside the iframe, you can interact with elements within it
		// For example, let's say you want to click a button or link inside the iframe
		WebElement buttonOrLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("element_id")));
		buttonOrLink.click();

		// Validate that the iframe has been clicked and the desired action is performed
		// For instance, you could check if a specific element is now visible
		WebElement validationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("validation_element_id")));
		assert validationElement.isDisplayed();

		// Switch back to the main content
		driver.switchTo().defaultContent();

		// Close the browser
		driver.quit();
	}
}



