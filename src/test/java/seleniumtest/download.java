package seleniumtest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class download {
@Test
	public void down() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://the-internet.herokuapp.com/download");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement clcik=driver.findElement(By.linkText("some-file.txt"));
	clcik.click();
	Thread.sleep(2000);
	
	File filelocation=new File("\\Downloads");
	File[] totalfiles=filelocation.listFiles();
	
	for (File file : totalfiles) {
		if(file.getName().equals("some-file.txt")) {
			System.out.println("file downloaded");
			break;
		}else {
			System.out.println("file not downloaded");
		}
	}
	}
}
