package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	static WebElement q;
	
	@Test
	public void testing() throws InterruptedException, IOException, AWTException  {
		System.out.println("Hello");

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/");
		
		//1.implict wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//2.Takscreenshot
		//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(f, new File("Path"));
		
		//3.Get and navigate
		//driver.navigate().to("https://www.demoblaze.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//4.maxmize window
		//driver.manage().window().maximize();
		
		//Dimension dimension=new Dimension(234, 670);
		//driver.manage().window().setSize(dimension);
		
		//5.refresh
		//WebElement one=driver.findElement(By.id("user-name"));
		//one.sendKeys("Hello");
		//driver.get(driver.getCurrentUrl());
		//driver.navigate().refresh();
		
		//JavascriptExecutor executor=(JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");
		//Can use robot class also
		
		//Robot robot=new Robot();
		//robot.keyPress(KeyEvent.VK_F5);
		//robot.keyRelease(KeyEvent.VK_F5);
		
		//6.switch to active element
		//driver.get("https://www.google.com/");
		//driver.switchTo().activeElement().sendKeys("Gopal");
		
		//PageFactory.initElements(driver,test1.class);
		//q.sendKeys("Hi Gopal");
		
		//7.send key input without sendkeys
		
		//JavascriptExecutor executor=(JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q'[0].value='hellow'","");
		
		//robot class
		
		//8.enter press
				driver.get("https://www.google.com/");
				//driver.switchTo().activeElement().sendKeys("Gopal"+Keys.ENTER);
				//driver.switchTo().activeElement().sendKeys("Gopal \n");
				//use submit method
				//use robot class
	}

}
