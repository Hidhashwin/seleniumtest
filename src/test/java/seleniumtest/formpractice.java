package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formpractice {
	@Test
	public void launchbrowser() throws InterruptedException, AWTException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.xpath("//h5"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", name);
		Thread.sleep(1000);
		WebElement firstname1=driver.findElement(By.id("firstName"));
		firstname1.sendKeys("Nandha");
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys("Kumar");
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("NandhaKumar@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		phonenumber.sendKeys("9786560098");
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		Thread.sleep(1000);
		
		WebElement nextbutton=driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"));
		nextbutton.click();
		Thread.sleep(1000);
		
		WebElement date=driver.findElement(By.xpath("//div[text()='6' and @aria-label='Choose Thursday, March 6th, 2025']"));
		date.click();
		Thread.sleep(2000);
		
		
		
		//WebElement dum=driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__"
				//+ "value-container--is-multi css-1hwfws3']"));
		//dum.click();
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		upload.click();
		Thread.sleep(1000);
		
		String file="C:\\Users\\WELCOME\\Desktop\\Site details\\Site1.png";
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement address=driver.findElement(By.id("currentAddress"));
		address.sendKeys("Hi this is Gopal");
		
		
		
		
		
		/*
		 * WebElement
		 * dropdown=driver.findElement(By.xpath("//*[text()='Select State']"));
		 * dropdown.sendKeys("NCR" +Keys.ENTER);
		 * 
		 * WebElement
		 * dropdown2=driver.findElement(By.xpath("//*[text()='Select City']"));
		 * dropdown2.sendKeys("Delhi" +Keys.ENTER);
		 */
		//WebElement hobby=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2' and @value='2']"));
		//hobby.click();
		
		
	}

}
